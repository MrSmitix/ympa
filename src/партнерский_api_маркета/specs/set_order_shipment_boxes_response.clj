(ns партнерский-api-маркета.specs.set-order-shipment-boxes-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.shipment-boxes-dto :refer :all]
            )
  (:import (java.io File)))


(def set-order-shipment-boxes-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) shipment-boxes-dto-spec
   })

(def set-order-shipment-boxes-response-spec
  (ds/spec
    {:name ::set-order-shipment-boxes-response
     :spec set-order-shipment-boxes-response-data}))
