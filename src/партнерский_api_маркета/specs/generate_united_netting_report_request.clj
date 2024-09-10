(ns партнерский-api-маркета.specs.generate-united-netting-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.placement-type :refer :all]
            )
  (:import (java.io File)))


(def generate-united-netting-report-request-data
  {
   (ds/req :businessId) int?
   (ds/opt :dateTimeFrom) inst?
   (ds/opt :dateTimeTo) inst?
   (ds/opt :dateFrom) inst?
   (ds/opt :dateTo) inst?
   (ds/opt :bankOrderId) int?
   (ds/opt :bankOrderDateTime) inst?
   (ds/opt :placementPrograms) (s/coll-of placement-type-spec)
   (ds/opt :inns) (s/coll-of string?)
   (ds/opt :campaignIds) (s/coll-of int?)
   })

(def generate-united-netting-report-request-spec
  (ds/spec
    {:name ::generate-united-netting-report-request
     :spec generate-united-netting-report-request-data}))
