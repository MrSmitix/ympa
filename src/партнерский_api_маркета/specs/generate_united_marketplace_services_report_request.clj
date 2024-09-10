(ns партнерский-api-маркета.specs.generate-united-marketplace-services-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.placement-type :refer :all]
            )
  (:import (java.io File)))


(def generate-united-marketplace-services-report-request-data
  {
   (ds/req :businessId) int?
   (ds/opt :dateTimeFrom) inst?
   (ds/opt :dateTimeTo) inst?
   (ds/opt :dateFrom) inst?
   (ds/opt :dateTo) inst?
   (ds/opt :yearFrom) int?
   (ds/opt :monthFrom) int?
   (ds/opt :yearTo) int?
   (ds/opt :monthTo) int?
   (ds/opt :placementPrograms) (s/coll-of placement-type-spec)
   (ds/opt :inns) (s/coll-of string?)
   (ds/opt :campaignIds) (s/coll-of int?)
   })

(def generate-united-marketplace-services-report-request-spec
  (ds/spec
    {:name ::generate-united-marketplace-services-report-request
     :spec generate-united-marketplace-services-report-request-data}))
