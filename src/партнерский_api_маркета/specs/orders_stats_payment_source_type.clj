(ns партнерский-api-маркета.specs.orders-stats-payment-source-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-payment-source-type-data
  {
   })

(def orders-stats-payment-source-type-spec
  (ds/spec
    {:name ::orders-stats-payment-source-type
     :spec orders-stats-payment-source-type-data}))
