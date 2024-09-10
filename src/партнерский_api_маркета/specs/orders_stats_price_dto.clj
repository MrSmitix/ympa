(ns партнерский-api-маркета.specs.orders-stats-price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.orders-stats-price-type :refer :all]
            )
  (:import (java.io File)))


(def orders-stats-price-dto-data
  {
   (ds/opt :type) orders-stats-price-type-spec
   (ds/opt :costPerItem) float?
   (ds/opt :total) float?
   })

(def orders-stats-price-dto-spec
  (ds/spec
    {:name ::orders-stats-price-dto
     :spec orders-stats-price-dto-data}))
