(ns партнерский-api-маркета.specs.mappings-offer-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-weight-dimensions-dto :refer :all]
            [партнерский-api-маркета.specs.day-of-week-type :refer :all]
            [партнерский-api-маркета.specs.offer-processing-state-dto :refer :all]
            [партнерский-api-маркета.specs.offer-availability-status-type :refer :all]
            [партнерский-api-маркета.specs.time-period-dto :refer :all]
            [партнерский-api-маркета.specs.time-period-dto :refer :all]
            [партнерский-api-маркета.specs.time-period-dto :refer :all]
            )
  (:import (java.io File)))


(def mappings-offer-info-dto-data
  {
   (ds/opt :name) string?
   (ds/opt :shopSku) string?
   (ds/opt :category) string?
   (ds/opt :vendor) string?
   (ds/opt :vendorCode) string?
   (ds/opt :description) string?
   (ds/opt :id) string?
   (ds/opt :feedId) int?
   (ds/opt :barcodes) (s/coll-of string?)
   (ds/opt :urls) (s/coll-of string?)
   (ds/opt :pictures) (s/coll-of string?)
   (ds/opt :manufacturer) string?
   (ds/opt :manufacturerCountries) (s/coll-of string?)
   (ds/opt :minShipment) int?
   (ds/opt :transportUnitSize) int?
   (ds/opt :quantumOfSupply) int?
   (ds/opt :deliveryDurationDays) int?
   (ds/opt :boxCount) int?
   (ds/opt :customsCommodityCodes) (s/coll-of string?)
   (ds/opt :weightDimensions) offer-weight-dimensions-dto-spec
   (ds/opt :supplyScheduleDays) (s/coll-of day-of-week-type-spec)
   (ds/opt :shelfLifeDays) int?
   (ds/opt :lifeTimeDays) int?
   (ds/opt :guaranteePeriodDays) int?
   (ds/opt :processingState) offer-processing-state-dto-spec
   (ds/opt :availability) offer-availability-status-type-spec
   (ds/opt :shelfLife) time-period-dto-spec
   (ds/opt :lifeTime) time-period-dto-spec
   (ds/opt :guaranteePeriod) time-period-dto-spec
   (ds/opt :certificate) string?
   })

(def mappings-offer-info-dto-spec
  (ds/spec
    {:name ::mappings-offer-info-dto
     :spec mappings-offer-info-dto-data}))
