(ns партнерский-api-маркета.specs.get-shipment-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.shipment-dto :refer :all]
            )
  (:import (java.io File)))


(def get-shipment-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) shipment-dto-spec
   })

(def get-shipment-response-spec
  (ds/spec
    {:name ::get-shipment-response
     :spec get-shipment-response-data}))
