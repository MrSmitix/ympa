(ns партнерский-api-маркета.specs.orders-stats-payment-order-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-payment-order-dto-data
  {
   (ds/opt :id) string?
   (ds/opt :date) inst?
   })

(def orders-stats-payment-order-dto-spec
  (ds/spec
    {:name ::orders-stats-payment-order-dto
     :spec orders-stats-payment-order-dto-data}))
