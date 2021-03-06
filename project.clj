(defproject sms-receipts "1.0.0-SNAPSHOT"
  :description "SMS receipts receiver web app"
  :url "http://infinite-journey-8177.herokuapp.com"
  :license {:name "The BSD 3-Clause License"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [environ "0.5.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "sms-receipts-standalone.jar"
  :profiles {:production {:env {:production true}}})
