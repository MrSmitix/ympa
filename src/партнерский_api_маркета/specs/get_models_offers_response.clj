(ns партнерский-api-маркета.specs.get-models-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.enriched-model-dto :refer :all]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def get-models-offers-response-data
  {
   (ds/req :models) (s/coll-of enriched-model-dto-spec)
   (ds/opt :currency) currency-type-spec
   (ds/opt :regionId) int?
   })

(def get-models-offers-response-spec
  (ds/spec
    {:name ::get-models-offers-response
     :spec get-models-offers-response-data}))
