(defproject test-clj "1.0.0"
  :description "FIXME: write"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.6.1"]
                 [ring/ring-core "0.3.7" :exclusions [javax.servlet/servlet-api]]
		 [ring/ring-servlet "0.3.7" :exclusions [javax.servlet/servlet-api]]]
  :dev-dependencies [[swank-clojure "1.2.1"]
		     [ring/ring-jetty-adapter "0.3.7"]
		     [uk.org.alienscience/leiningen-war "0.0.12"]
		     [ring/ring-devel "0.3.7"]
		     [javax.servlet/servlet-api "2.5"]]
  :aot [test-clj.servlet]
  :war {:web-content "public"})
