(ns партнерский-api-маркета.specs.enriched-model-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.model-price-dto :refer :all]
            [партнерский-api-маркета.specs.model-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def enriched-model-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :prices) model-price-dto-spec
   (ds/opt :offers) (s/coll-of model-offer-dto-spec)
   (ds/opt :offlineOffers) int?
   (ds/opt :onlineOffers) int?
   })

(def enriched-model-dto-spec
  (ds/spec
    {:name ::enriched-model-dto
     :spec enriched-model-dto-data}))
