(ns партнерский-api-маркета.specs.get-shipment-orders-info-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.orders-shipment-info-dto :refer :all]
            )
  (:import (java.io File)))


(def get-shipment-orders-info-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) orders-shipment-info-dto-spec
   })

(def get-shipment-orders-info-response-spec
  (ds/spec
    {:name ::get-shipment-orders-info-response
     :spec get-shipment-orders-info-response-data}))
