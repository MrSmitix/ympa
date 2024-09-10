(ns партнерский-api-маркета.specs.order-payment-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-payment-type-data
  {
   })

(def order-payment-type-spec
  (ds/spec
    {:name ::order-payment-type
     :spec order-payment-type-data}))
