(ns партнерский-api-маркета.specs.confirm-shipment-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def confirm-shipment-request-data
  {
   (ds/opt :externalShipmentId) string?
   })

(def confirm-shipment-request-spec
  (ds/spec
    {:name ::confirm-shipment-request
     :spec confirm-shipment-request-data}))
