(ns партнерский-api-маркета.specs.order-shipment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-track-dto :refer :all]
            [партнерский-api-маркета.specs.order-parcel-box-dto :refer :all]
            )
  (:import (java.io File)))


(def order-shipment-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :shipmentDate) string?
   (ds/opt :shipmentTime) string?
   (ds/opt :tracks) (s/coll-of order-track-dto-spec)
   (ds/opt :boxes) (s/coll-of order-parcel-box-dto-spec)
   })

(def order-shipment-dto-spec
  (ds/spec
    {:name ::order-shipment-dto
     :spec order-shipment-dto-data}))
