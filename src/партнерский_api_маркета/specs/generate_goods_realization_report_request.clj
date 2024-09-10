(ns партнерский-api-маркета.specs.generate-goods-realization-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-goods-realization-report-request-data
  {
   (ds/req :campaignId) int?
   (ds/req :year) int?
   (ds/req :month) int?
   })

(def generate-goods-realization-report-request-spec
  (ds/spec
    {:name ::generate-goods-realization-report-request
     :spec generate-goods-realization-report-request-data}))
