(ns партнерский-api-маркета.specs.orders-stats-payment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.orders-stats-payment-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-payment-source-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-payment-order-dto :refer :all]
            )
  (:import (java.io File)))


(def orders-stats-payment-dto-data
  {
   (ds/opt :id) string?
   (ds/opt :date) inst?
   (ds/opt :type) orders-stats-payment-type-spec
   (ds/opt :source) orders-stats-payment-source-type-spec
   (ds/opt :total) float?
   (ds/opt :paymentOrder) orders-stats-payment-order-dto-spec
   })

(def orders-stats-payment-dto-spec
  (ds/spec
    {:name ::orders-stats-payment-dto
     :spec orders-stats-payment-dto-data}))
