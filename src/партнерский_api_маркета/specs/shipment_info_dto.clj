(ns партнерский-api-маркета.specs.shipment-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shipment-type :refer :all]
            [партнерский-api-маркета.specs.partner-shipment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.partner-shipment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.delivery-service-dto :refer :all]
            [партнерский-api-маркета.specs.pallets-count-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-status-type :refer :all]
            )
  (:import (java.io File)))


(def shipment-info-dto-data
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
   (ds/opt :status) shipment-status-type-spec
   (ds/opt :statusDescription) string?
   (ds/opt :statusUpdateTime) inst?
   })

(def shipment-info-dto-spec
  (ds/spec
    {:name ::shipment-info-dto
     :spec shipment-info-dto-data}))
