(ns партнерский-api-маркета.specs.get-fulfillment-warehouses-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.fulfillment-warehouses-dto :refer :all]
            )
  (:import (java.io File)))


(def get-fulfillment-warehouses-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) fulfillment-warehouses-dto-spec
   })

(def get-fulfillment-warehouses-response-spec
  (ds/spec
    {:name ::get-fulfillment-warehouses-response
     :spec get-fulfillment-warehouses-response-data}))
