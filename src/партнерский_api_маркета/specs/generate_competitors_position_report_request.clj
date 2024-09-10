(ns партнерский-api-маркета.specs.generate-competitors-position-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-competitors-position-report-request-data
  {
   (ds/req :businessId) int?
   (ds/req :categoryId) int?
   (ds/req :dateFrom) inst?
   (ds/req :dateTo) inst?
   })

(def generate-competitors-position-report-request-spec
  (ds/spec
    {:name ::generate-competitors-position-report-request
     :spec generate-competitors-position-report-request-data}))
