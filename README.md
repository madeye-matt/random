# random

A simple Clojure library with some data for generating random names, domain names and email addresses

## Installation

leiningen

    [com.madeye.clojure.random/core "0.1.0"]

maven

    <dependency>
      <groupId>com.madeye.clojure.random</groupId>
      <artifactId>ampachedb</artifactId>
      <version>0.1.0</version>
    </dependency>


## Usage

	com.madeye.clojure.random.core=> (initialise "data/names.txt" "data/words.txt" "data/domains.txt")
	#'com.madeye.clojure.random.core/domains
	com.madeye.clojure.random.core=> (repeatedly 10 random-full-name)
	("Kayleen Flegle" "Phyllis Mccloy" "Lekisha Fullam" "Tonia Godbout" "Emerson Speegle" "Sharyl Soule" "Edelmira Wentzel" "Beatris Hoehne" "Lekisha Portwood" "Ingeborg Cole")
	com.madeye.clojure.random.core=> (repeatedly 10 random-domain)
	("backspacing.net.nz" "albino.gs" "hippocampus.ms" "dystrophy.ly" "platforms.ly" "humpier.de" "coeducation.com.mx" "saleswomen.ms" "erythroblast.ly" "timely.eu")
	com.madeye.clojure.random.core=> (repeatedly 10 random-email)
	("Edelmira.Boelter@cankerous.net" "Jene.Speegle@miscible.bz" "Beverley.Dimauro@prologues.com.mx" "Glennis.Foronda@turnarounds.org.cn" "Tomeka.Gregson@accentuating.org.cn" "Drusilla.Foskey@communities.me.uk" "Debbra.Winborne@deselects.co.uk" "Stephaine.Hupp@handed.org.nz" "Janyce.Luton@vaginally.mobi" "Toya.Macri@testifying.net.nz")
	com.madeye.clojure.random.core=> 

## Options

There are 3 files in the data subdirectory that are used to drive the randomness.  These can be changed to include whatever you wish. See Acknowledgements below for the sources of these files.

names.txt - a random selection of names
domains.txt - a selection of domain extensions
words.txt - a British English dictionary used to generate domain names

## Acknowledgements

+ data/names.txt - generated by spamming [lisofrandomnames.com](http://listofrandomnames.com/) a few times
+ data/domains.txt - taken from [drbillbailey.com](http://www.drbillbailey.net/extensions.html)
+ data/words.txt - taken from [Curlew Communications](http://www.curlewcommunications.co.uk/wordlist.html)

## License

Copyright © 2014 Madeye Software Ltd.

osstributed under the Eclipse Public License, the same as Clojure.
