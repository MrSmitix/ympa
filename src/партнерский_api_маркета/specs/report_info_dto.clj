(ns партнерский-api-маркета.specs.report-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.report-status-type :refer :all]
            [партнерский-api-маркета.specs.report-sub-status-type :refer :all]
            )
  (:import (java.io File)))


(def report-info-dto-data
  {
   (ds/req :status) report-status-type-spec
   (ds/opt :subStatus) report-sub-status-type-spec
   (ds/req :generationRequestedAt) inst?
   (ds/opt :generationFinishedAt) inst?
   (ds/opt :file) string?
   (ds/opt :estimatedGenerationTime) int?
   })

(def report-info-dto-spec
  (ds/spec
    {:name ::report-info-dto
     :spec report-info-dto-data}))
