(ns партнерский-api-маркета.specs.orders-stats-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.orders-stats-price-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-details-dto :refer :all]
            )
  (:import (java.io File)))


(def orders-stats-item-dto-data
  {
   (ds/opt :offerName) string?
   (ds/opt :marketSku) int?
   (ds/opt :shopSku) string?
   (ds/opt :count) int?
   (ds/opt :prices) (s/coll-of orders-stats-price-dto-spec)
   (ds/opt :warehouse) orders-stats-warehouse-dto-spec
   (ds/opt :details) (s/coll-of orders-stats-details-dto-spec)
   (ds/opt :cisList) (s/coll-of string?)
   (ds/opt :initialCount) int?
   (ds/opt :bidFee) int?
   (ds/opt :cofinanceThreshold) float?
   (ds/opt :cofinanceValue) float?
   })

(def orders-stats-item-dto-spec
  (ds/spec
    {:name ::orders-stats-item-dto
     :spec orders-stats-item-dto-data}))
