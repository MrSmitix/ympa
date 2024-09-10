(ns партнерский-api-маркета.specs.orders-stats-order-payment-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-order-payment-type-data
  {
   })

(def orders-stats-order-payment-type-spec
  (ds/spec
    {:name ::orders-stats-order-payment-type
     :spec orders-stats-order-payment-type-data}))
