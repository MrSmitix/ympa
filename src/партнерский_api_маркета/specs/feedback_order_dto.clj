(ns партнерский-api-маркета.specs.feedback-order-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feedback-delivery-type :refer :all]
            )
  (:import (java.io File)))


(def feedback-order-dto-data
  {
   (ds/opt :shopOrderId) string?
   (ds/opt :delivery) feedback-delivery-type-spec
   })

(def feedback-order-dto-spec
  (ds/spec
    {:name ::feedback-order-dto
     :spec feedback-order-dto-data}))
