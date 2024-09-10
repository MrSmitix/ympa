(ns партнерский-api-маркета.specs.verify-order-eac-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.eac-verification-result-dto :refer :all]
            )
  (:import (java.io File)))


(def verify-order-eac-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) eac-verification-result-dto-spec
   })

(def verify-order-eac-response-spec
  (ds/spec
    {:name ::verify-order-eac-response
     :spec verify-order-eac-response-data}))
