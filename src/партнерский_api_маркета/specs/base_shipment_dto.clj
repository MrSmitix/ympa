(ns партнерский-api-маркета.specs.base-shipment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shipment-type :refer :all]
            [партнерский-api-маркета.specs.partner-shipment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.partner-shipment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.delivery-service-dto :refer :all]
            [партнерский-api-маркета.specs.pallets-count-dto :refer :all]
            )
  (:import (java.io File)))


(def base-shipment-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :planIntervalFrom) inst?
   (ds/opt :planIntervalTo) inst?
   (ds/opt :shipmentType) shipment-type-spec
   (ds/opt :warehouse) partner-shipment-warehouse-dto-spec
   (ds/opt :warehouseTo) partner-shipment-warehouse-dto-spec
   (ds/opt :externalId) string?
   (ds/opt :deliveryService) delivery-service-dto-spec
   (ds/opt :palletsCount) pallets-count-dto-spec
   (ds/req :orderIds) (s/coll-of int?)
   (ds/opt :draftCount) int?
   (ds/opt :plannedCount) int?
   (ds/opt :factCount) int?
   })

(def base-shipment-dto-spec
  (ds/spec
    {:name ::base-shipment-dto
     :spec base-shipment-dto-data}))
