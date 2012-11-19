(ns sample-app.views.welcome
  (:require [noir.response :as response])
  (:use [noir.core :only (defpage)]))

(defpage "/" []
  (response/json {:success true
                  :msg "hello from serverland"}))
