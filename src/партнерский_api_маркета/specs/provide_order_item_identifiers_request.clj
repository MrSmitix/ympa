(ns партнерский-api-маркета.specs.provide-order-item-identifiers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-item-instance-modification-dto :refer :all]
            )
  (:import (java.io File)))


(def provide-order-item-identifiers-request-data
  {
   (ds/req :items) (s/coll-of order-item-instance-modification-dto-spec)
   })

(def provide-order-item-identifiers-request-spec
  (ds/spec
    {:name ::provide-order-item-identifiers-request
     :spec provide-order-item-identifiers-request-data}))
