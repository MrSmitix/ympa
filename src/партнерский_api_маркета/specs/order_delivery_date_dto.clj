(ns партнерский-api-маркета.specs.order-delivery-date-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-delivery-date-dto-data
  {
   (ds/req :toDate) inst?
   })

(def order-delivery-date-dto-spec
  (ds/spec
    {:name ::order-delivery-date-dto
     :spec order-delivery-date-dto-data}))
