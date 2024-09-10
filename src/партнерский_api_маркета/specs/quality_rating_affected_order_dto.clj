(ns партнерский-api-маркета.specs.quality-rating-affected-order-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.affected-order-quality-rating-component-type :refer :all]
            )
  (:import (java.io File)))


(def quality-rating-affected-order-dto-data
  {
   (ds/req :orderId) int?
   (ds/req :description) string?
   (ds/req :componentType) affected-order-quality-rating-component-type-spec
   })

(def quality-rating-affected-order-dto-spec
  (ds/spec
    {:name ::quality-rating-affected-order-dto
     :spec quality-rating-affected-order-dto-data}))
