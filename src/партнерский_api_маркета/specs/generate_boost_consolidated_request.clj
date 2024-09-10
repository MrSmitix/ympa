(ns партнерский-api-маркета.specs.generate-boost-consolidated-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-boost-consolidated-request-data
  {
   (ds/req :businessId) int?
   (ds/req :dateFrom) inst?
   (ds/req :dateTo) inst?
   })

(def generate-boost-consolidated-request-spec
  (ds/spec
    {:name ::generate-boost-consolidated-request
     :spec generate-boost-consolidated-request-data}))
