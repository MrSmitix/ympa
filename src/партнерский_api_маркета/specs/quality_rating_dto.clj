(ns партнерский-api-маркета.specs.quality-rating-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.quality-rating-component-dto :refer :all]
            )
  (:import (java.io File)))


(def quality-rating-dto-data
  {
   (ds/req :rating) int?
   (ds/req :calculationDate) inst?
   (ds/req :components) (s/coll-of quality-rating-component-dto-spec)
   })

(def quality-rating-dto-spec
  (ds/spec
    {:name ::quality-rating-dto
     :spec quality-rating-dto-data}))
