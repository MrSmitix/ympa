(ns партнерский-api-маркета.specs.generate-stocks-on-warehouses-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-stocks-on-warehouses-report-request-data
  {
   (ds/req :campaignId) int?
   (ds/opt :warehouseIds) (s/coll-of int?)
   (ds/opt :reportDate) inst?
   (ds/opt :categoryIds) (s/coll-of int?)
   (ds/opt :hasStocks) boolean?
   })

(def generate-stocks-on-warehouses-report-request-spec
  (ds/spec
    {:name ::generate-stocks-on-warehouses-report-request
     :spec generate-stocks-on-warehouses-report-request-data}))
