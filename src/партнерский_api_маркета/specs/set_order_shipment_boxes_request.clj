(ns партнерский-api-маркета.specs.set-order-shipment-boxes-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.parcel-box-dto :refer :all]
            )
  (:import (java.io File)))


(def set-order-shipment-boxes-request-data
  {
   (ds/req :boxes) (s/coll-of parcel-box-dto-spec)
   })

(def set-order-shipment-boxes-request-spec
  (ds/spec
    {:name ::set-order-shipment-boxes-request
     :spec set-order-shipment-boxes-request-data}))
