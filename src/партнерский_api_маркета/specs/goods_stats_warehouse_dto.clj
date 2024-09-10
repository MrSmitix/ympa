(ns партнерский-api-маркета.specs.goods-stats-warehouse-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.warehouse-stock-dto :refer :all]
            )
  (:import (java.io File)))


(def goods-stats-warehouse-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/req :stocks) (s/coll-of warehouse-stock-dto-spec)
   })

(def goods-stats-warehouse-dto-spec
  (ds/spec
    {:name ::goods-stats-warehouse-dto
     :spec goods-stats-warehouse-dto-data}))
