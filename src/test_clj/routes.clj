(ns test-clj.routes
  (:use compojure.core 
	ring.util.response)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes handler

  (GET ["/:context/request" , :context #".[^/]*"] req
       (str "<h1>Hello World</h1>" req))
  
  (route/not-found "<h1>Page not found</h1>"))

(def app
     (handler/site handler))