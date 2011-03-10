(ns jetty
  (:use test-clj.routes
	ring.adapter.jetty))

(defn boot []
  (future (run-jetty #'app {:port 8080})))