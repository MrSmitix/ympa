(ns партнерский-api-маркета.specs.goods-stats-goods-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.goods-stats-weight-dimensions-dto :refer :all]
            [партнерский-api-маркета.specs.goods-stats-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.tariff-dto :refer :all]
            )
  (:import (java.io File)))


(def goods-stats-goods-dto-data
  {
   (ds/opt :shopSku) string?
   (ds/opt :marketSku) int?
   (ds/opt :name) string?
   (ds/opt :price) float?
   (ds/opt :categoryId) int?
   (ds/opt :categoryName) string?
   (ds/opt :weightDimensions) goods-stats-weight-dimensions-dto-spec
   (ds/opt :warehouses) (s/coll-of goods-stats-warehouse-dto-spec)
   (ds/opt :tariffs) (s/coll-of tariff-dto-spec)
   (ds/opt :pictures) (s/coll-of string?)
   })

(def goods-stats-goods-dto-spec
  (ds/spec
    {:name ::goods-stats-goods-dto
     :spec goods-stats-goods-dto-data}))
