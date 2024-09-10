(ns партнерский-api-маркета.specs.provide-order-digital-codes-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-digital-item-dto :refer :all]
            )
  (:import (java.io File)))


(def provide-order-digital-codes-request-data
  {
   (ds/req :items) (s/coll-of order-digital-item-dto-spec)
   })

(def provide-order-digital-codes-request-spec
  (ds/spec
    {:name ::provide-order-digital-codes-request
     :spec provide-order-digital-codes-request-data}))
