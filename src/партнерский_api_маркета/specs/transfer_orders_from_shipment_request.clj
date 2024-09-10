(ns партнерский-api-маркета.specs.transfer-orders-from-shipment-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def transfer-orders-from-shipment-request-data
  {
   (ds/req :orderIds) (s/coll-of int?)
   })

(def transfer-orders-from-shipment-request-spec
  (ds/spec
    {:name ::transfer-orders-from-shipment-request
     :spec transfer-orders-from-shipment-request-data}))
