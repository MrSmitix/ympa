(ns партнерский-api-маркета.specs.offer-card-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.get-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.parameter-value-dto :refer :all]
            [партнерский-api-маркета.specs.offer-card-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-card-recommendation-dto :refer :all]
            [партнерский-api-маркета.specs.offer-error-dto :refer :all]
            [партнерский-api-маркета.specs.offer-error-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-card-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :mapping) get-mapping-dto-spec
   (ds/opt :parameterValues) (s/coll-of parameter-value-dto-spec)
   (ds/opt :cardStatus) offer-card-status-type-spec
   (ds/opt :contentRating) int?
   (ds/opt :recommendations) (s/coll-of offer-card-recommendation-dto-spec)
   (ds/opt :errors) (s/coll-of offer-error-dto-spec)
   (ds/opt :warnings) (s/coll-of offer-error-dto-spec)
   })

(def offer-card-dto-spec
  (ds/spec
    {:name ::offer-card-dto
     :spec offer-card-dto-data}))
