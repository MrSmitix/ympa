(ns партнерский-api-маркета.specs.orders-stats-payment-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-payment-type-data
  {
   })

(def orders-stats-payment-type-spec
  (ds/spec
    {:name ::orders-stats-payment-type
     :spec orders-stats-payment-type-data}))
