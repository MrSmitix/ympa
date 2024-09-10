(ns партнерский-api-маркета.specs.order-delivery-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-delivery-type :refer :all]
            [партнерский-api-маркета.specs.order-delivery-partner-type :refer :all]
            [партнерский-api-маркета.specs.order-courier-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-dates-dto :refer :all]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-address-dto :refer :all]
            [партнерский-api-маркета.specs.order-vat-type :refer :all]
            [партнерский-api-маркета.specs.order-lift-type :refer :all]
            [партнерский-api-маркета.specs.order-delivery-dispatch-type :refer :all]
            [партнерский-api-маркета.specs.order-track-dto :refer :all]
            [партнерский-api-маркета.specs.order-shipment-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-eac-type :refer :all]
            )
  (:import (java.io File)))


(def order-delivery-dto-data
  {
   (ds/opt :id) string?
   (ds/opt :type) order-delivery-type-spec
   (ds/opt :serviceName) string?
   (ds/opt :price) float?
   (ds/opt :deliveryPartnerType) order-delivery-partner-type-spec
   (ds/opt :courier) order-courier-dto-spec
   (ds/opt :dates) order-delivery-dates-dto-spec
   (ds/opt :region) region-dto-spec
   (ds/opt :address) order-delivery-address-dto-spec
   (ds/opt :vat) order-vat-type-spec
   (ds/opt :deliveryServiceId) int?
   (ds/opt :liftType) order-lift-type-spec
   (ds/opt :liftPrice) float?
   (ds/opt :outletCode) string?
   (ds/opt :outletStorageLimitDate) string?
   (ds/opt :dispatchType) order-delivery-dispatch-type-spec
   (ds/opt :tracks) (s/coll-of order-track-dto-spec)
   (ds/opt :shipments) (s/coll-of order-shipment-dto-spec)
   (ds/opt :estimated) boolean?
   (ds/opt :eacType) order-delivery-eac-type-spec
   (ds/opt :eacCode) string?
   })

(def order-delivery-dto-spec
  (ds/spec
    {:name ::order-delivery-dto
     :spec order-delivery-dto-data}))
