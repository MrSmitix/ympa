(ns партнерский-api-маркета.specs.sku-bid-recommendation-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.bid-recommendation-item-dto :refer :all]
            [партнерский-api-маркета.specs.price-recommendation-item-dto :refer :all]
            )
  (:import (java.io File)))


(def sku-bid-recommendation-item-dto-data
  {
   (ds/req :sku) string?
   (ds/req :bid) int?
   (ds/opt :bidRecommendations) (s/coll-of bid-recommendation-item-dto-spec)
   (ds/opt :priceRecommendations) (s/coll-of price-recommendation-item-dto-spec)
   })

(def sku-bid-recommendation-item-dto-spec
  (ds/spec
    {:name ::sku-bid-recommendation-item-dto
     :spec sku-bid-recommendation-item-dto-data}))
