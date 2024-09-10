(ns партнерский-api-маркета.specs.order-payment-method-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-payment-method-type-data
  {
   })

(def order-payment-method-type-spec
  (ds/spec
    {:name ::order-payment-method-type
     :spec order-payment-method-type-data}))
