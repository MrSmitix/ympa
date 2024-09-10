(ns партнерский-api-маркета.specs.generate-goods-movement-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-goods-movement-report-request-data
  {
   (ds/req :campaignId) int?
   (ds/req :dateFrom) inst?
   (ds/req :dateTo) inst?
   (ds/opt :shopSku) string?
   })

(def generate-goods-movement-report-request-spec
  (ds/spec
    {:name ::generate-goods-movement-report-request
     :spec generate-goods-movement-report-request-data}))
