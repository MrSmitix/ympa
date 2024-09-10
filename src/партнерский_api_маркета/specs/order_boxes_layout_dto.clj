(ns партнерский-api-маркета.specs.order-boxes-layout-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.enriched-order-box-layout-dto :refer :all]
            )
  (:import (java.io File)))


(def order-boxes-layout-dto-data
  {
   (ds/req :boxes) (s/coll-of enriched-order-box-layout-dto-spec)
   })

(def order-boxes-layout-dto-spec
  (ds/spec
    {:name ::order-boxes-layout-dto
     :spec order-boxes-layout-dto-data}))
