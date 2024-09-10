(ns партнерский-api-маркета.specs.quality-rating-component-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.quality-rating-component-type :refer :all]
            )
  (:import (java.io File)))


(def quality-rating-component-dto-data
  {
   (ds/req :value) float?
   (ds/req :componentType) quality-rating-component-type-spec
   })

(def quality-rating-component-dto-spec
  (ds/spec
    {:name ::quality-rating-component-dto
     :spec quality-rating-component-dto-data}))
