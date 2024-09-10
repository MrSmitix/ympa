(ns партнерский-api-маркета.specs.quality-rating-details-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.quality-rating-affected-order-dto :refer :all]
            )
  (:import (java.io File)))


(def quality-rating-details-dto-data
  {
   (ds/req :affectedOrders) (s/coll-of quality-rating-affected-order-dto-spec)
   })

(def quality-rating-details-dto-spec
  (ds/spec
    {:name ::quality-rating-details-dto
     :spec quality-rating-details-dto-data}))
