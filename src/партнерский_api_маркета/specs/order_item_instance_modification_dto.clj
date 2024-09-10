(ns партнерский-api-маркета.specs.order-item-instance-modification-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.brief-order-item-instance-dto :refer :all]
            )
  (:import (java.io File)))


(def order-item-instance-modification-dto-data
  {
   (ds/req :id) int?
   (ds/req :instances) (s/coll-of brief-order-item-instance-dto-spec)
   })

(def order-item-instance-modification-dto-spec
  (ds/spec
    {:name ::order-item-instance-modification-dto
     :spec order-item-instance-modification-dto-data}))
