(ns партнерский-api-маркета.specs.category-parameter-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.parameter-type :refer :all]
            [партнерский-api-маркета.specs.category-parameter-unit-dto :refer :all]
            [партнерский-api-маркета.specs.offer-card-recommendation-type :refer :all]
            [партнерский-api-маркета.specs.parameter-value-option-dto :refer :all]
            [партнерский-api-маркета.specs.parameter-value-constraints-dto :refer :all]
            [партнерский-api-маркета.specs.value-restriction-dto :refer :all]
            )
  (:import (java.io File)))


(def category-parameter-dto-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   (ds/req :type) parameter-type-spec
   (ds/opt :unit) category-parameter-unit-dto-spec
   (ds/opt :description) string?
   (ds/opt :recommendationTypes) (s/coll-of offer-card-recommendation-type-spec)
   (ds/req :required) boolean?
   (ds/req :filtering) boolean?
   (ds/req :distinctive) boolean?
   (ds/req :multivalue) boolean?
   (ds/req :allowCustomValues) boolean?
   (ds/opt :values) (s/coll-of parameter-value-option-dto-spec)
   (ds/opt :constraints) parameter-value-constraints-dto-spec
   (ds/opt :valueRestrictions) (s/coll-of value-restriction-dto-spec)
   })

(def category-parameter-dto-spec
  (ds/spec
    {:name ::category-parameter-dto
     :spec category-parameter-dto-data}))
