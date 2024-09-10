(ns партнерский-api-маркета.specs.shipment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shipment-type :refer :all]
            [партнерский-api-маркета.specs.partner-shipment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.partner-shipment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.delivery-service-dto :refer :all]
            [партнерский-api-маркета.specs.pallets-count-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-status-change-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-action-type :refer :all]
            )
  (:import (java.io File)))


(def shipment-dto-data
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
   (ds/opt :currentStatus) shipment-status-change-dto-spec
   (ds/req :availableActions) (s/coll-of shipment-action-type-spec)
   })

(def shipment-dto-spec
  (ds/spec
    {:name ::shipment-dto
     :spec shipment-dto-data}))
