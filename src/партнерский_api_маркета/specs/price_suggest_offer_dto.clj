(ns партнерский-api-маркета.specs.price-suggest-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-suggest-dto :refer :all]
            )
  (:import (java.io File)))


(def price-suggest-offer-dto-data
  {
   (ds/opt :marketSku) int?
   (ds/opt :offerId) string?
   (ds/opt :priceSuggestion) (s/coll-of price-suggest-dto-spec)
   })

(def price-suggest-offer-dto-spec
  (ds/spec
    {:name ::price-suggest-offer-dto
     :spec price-suggest-offer-dto-data}))
