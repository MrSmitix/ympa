(ns партнерский-api-маркета.specs.full-outlet-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.outlet-type :refer :all]
            [партнерский-api-маркета.specs.outlet-visibility-type :refer :all]
            [партнерский-api-маркета.specs.outlet-address-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-working-schedule-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-delivery-rule-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-status-type :refer :all]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            )
  (:import (java.io File)))


(def full-outlet-dto-data
  {
   (ds/req :name) string?
   (ds/req :type) outlet-type-spec
   (ds/opt :coords) string?
   (ds/opt :isMain) boolean?
   (ds/opt :shopOutletCode) string?
   (ds/opt :visibility) outlet-visibility-type-spec
   (ds/req :address) outlet-address-dto-spec
   (ds/req :phones) (s/coll-of string?)
   (ds/req :workingSchedule) outlet-working-schedule-dto-spec
   (ds/opt :deliveryRules) (s/coll-of outlet-delivery-rule-dto-spec)
   (ds/opt :storagePeriod) int?
   (ds/opt :id) int?
   (ds/opt :status) outlet-status-type-spec
   (ds/opt :region) region-dto-spec
   (ds/opt :shopOutletId) string?
   (ds/opt :workingTime) string?
   (ds/opt :moderationReason) string?
   })

(def full-outlet-dto-spec
  (ds/spec
    {:name ::full-outlet-dto
     :spec full-outlet-dto-data}))
