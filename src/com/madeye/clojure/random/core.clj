(ns com.madeye.clojure.random.core
  (:gen-class)
  (:require [clojure.string :as str]))
      
(defn- reload []
  (use :reload-all 'random.core)
)

(defn- parse-names
  [input-filename]
  (let [name-map (into {} (map #(-> % str/trim (str/split #" ")) (str/split (slurp input-filename) #"\n")))
  	    first-names (sort (keys name-map))
  	    last-names (sort (vals name-map))]
  	{ :first-names first-names :last-names last-names }
  )
)

(defn initialise
  [names-file words-file domain-file]
  (def names (parse-names names-file))
  (def words (map str/trim (str/split (slurp words-file) #"\n")))
  (def domains (map str/trim (str/split (slurp domain-file) #"\n")))
)

(defn- pick-random-from-list
	[list]
	(nth list (rand-int (count list)))
)

(defn- random-name 
	[list-kw]
	(let [name-list (list-kw names)]
		(pick-random-from-list name-list)
	)
)

(defn random-full-name
	([sep]
		(str (random-name :first-names) sep (random-name :last-names)))
	([]
		(random-full-name " ")	
	)
)

(defn random-word [] (pick-random-from-list words))
(defn random-domain-extension [] (pick-random-from-list domains))
(defn random-domain [] (str (random-word) (random-domain-extension)))
(defn random-email [] (str (random-full-name ".") "@" (random-domain)))

(defn random-words
  [num-words]
  (reduce #(str %1 " " %2) (repeatedly num-words random-word))
)
