(ns партнерский-api-маркета.specs.order-item-modification-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.brief-order-item-instance-dto :refer :all]
            )
  (:import (java.io File)))


(def order-item-modification-dto-data
  {
   (ds/req :id) int?
   (ds/req :count) int?
   (ds/opt :instances) (s/coll-of brief-order-item-instance-dto-spec)
   })

(def order-item-modification-dto-spec
  (ds/spec
    {:name ::order-item-modification-dto
     :spec order-item-modification-dto-data}))
