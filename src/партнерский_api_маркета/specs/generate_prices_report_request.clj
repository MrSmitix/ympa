(ns партнерский-api-маркета.specs.generate-prices-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-prices-report-request-data
  {
   (ds/opt :businessId) int?
   (ds/opt :campaignId) int?
   (ds/opt :categoryIds) (s/coll-of int?)
   (ds/opt :creationDateFrom) inst?
   (ds/opt :creationDateTo) inst?
   })

(def generate-prices-report-request-spec
  (ds/spec
    {:name ::generate-prices-report-request
     :spec generate-prices-report-request-data}))
