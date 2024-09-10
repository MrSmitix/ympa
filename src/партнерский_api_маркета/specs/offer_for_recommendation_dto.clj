(ns партнерский-api-маркета.specs.offer-for-recommendation-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-dto :refer :all]
            [партнерский-api-маркета.specs.price-competitiveness-type :refer :all]
            )
  (:import (java.io File)))


(def offer-for-recommendation-dto-data
  {
   (ds/opt :offerId) string?
   (ds/opt :price) base-price-dto-spec
   (ds/opt :cofinancePrice) get-price-dto-spec
   (ds/opt :competitiveness) price-competitiveness-type-spec
   (ds/opt :shows) int?
   })

(def offer-for-recommendation-dto-spec
  (ds/spec
    {:name ::offer-for-recommendation-dto
     :spec offer-for-recommendation-dto-data}))
