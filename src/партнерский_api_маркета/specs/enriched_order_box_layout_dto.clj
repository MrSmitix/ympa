(ns партнерский-api-маркета.specs.enriched-order-box-layout-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-box-layout-item-dto :refer :all]
            )
  (:import (java.io File)))


(def enriched-order-box-layout-dto-data
  {
   (ds/req :items) (s/coll-of order-box-layout-item-dto-spec)
   (ds/opt :boxId) int?
   })

(def enriched-order-box-layout-dto-spec
  (ds/spec
    {:name ::enriched-order-box-layout-dto
     :spec enriched-order-box-layout-dto-data}))
