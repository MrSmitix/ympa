(ns партнерский-api-маркета.specs.generate-shows-sales-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shows-sales-grouping-type :refer :all]
            )
  (:import (java.io File)))


(def generate-shows-sales-report-request-data
  {
   (ds/opt :businessId) int?
   (ds/opt :campaignId) int?
   (ds/req :dateFrom) inst?
   (ds/req :dateTo) inst?
   (ds/req :grouping) shows-sales-grouping-type-spec
   })

(def generate-shows-sales-report-request-spec
  (ds/spec
    {:name ::generate-shows-sales-report-request
     :spec generate-shows-sales-report-request-data}))
