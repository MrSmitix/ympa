(ns партнерский-api-маркета.specs.order-digital-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-digital-item-dto-data
  {
   (ds/req :id) int?
   (ds/req :code) string?
   (ds/req :slip) string?
   (ds/req :activate_till) inst?
   })

(def order-digital-item-dto-spec
  (ds/spec
    {:name ::order-digital-item-dto
     :spec order-digital-item-dto-data}))
