(ns партнерский-api-маркета.specs.order-box-layout-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-box-layout-partial-count-dto :refer :all]
            [партнерский-api-маркета.specs.brief-order-item-instance-dto :refer :all]
            )
  (:import (java.io File)))


(def order-box-layout-item-dto-data
  {
   (ds/req :id) int?
   (ds/opt :fullCount) int?
   (ds/opt :partialCount) order-box-layout-partial-count-dto-spec
   (ds/opt :instances) (s/coll-of brief-order-item-instance-dto-spec)
   })

(def order-box-layout-item-dto-spec
  (ds/spec
    {:name ::order-box-layout-item-dto
     :spec order-box-layout-item-dto-data}))
