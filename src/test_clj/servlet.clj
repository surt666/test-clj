(ns test-clj.servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:require [compojure.route :as route])
  (:use ring.util.servlet
	[test-clj.routes :only [app]]))

(defservice app)