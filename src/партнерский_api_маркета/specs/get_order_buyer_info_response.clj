(ns партнерский-api-маркета.specs.get-order-buyer-info-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.order-buyer-info-dto :refer :all]
            )
  (:import (java.io File)))


(def get-order-buyer-info-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) order-buyer-info-dto-spec
   })

(def get-order-buyer-info-response-spec
  (ds/spec
    {:name ::get-order-buyer-info-response
     :spec get-order-buyer-info-response-data}))
