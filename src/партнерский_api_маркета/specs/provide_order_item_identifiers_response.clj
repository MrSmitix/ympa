(ns партнерский-api-маркета.specs.provide-order-item-identifiers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.order-items-modification-result-dto :refer :all]
            )
  (:import (java.io File)))


(def provide-order-item-identifiers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) order-items-modification-result-dto-spec
   })

(def provide-order-item-identifiers-response-spec
  (ds/spec
    {:name ::provide-order-item-identifiers-response
     :spec provide-order-item-identifiers-response-data}))
