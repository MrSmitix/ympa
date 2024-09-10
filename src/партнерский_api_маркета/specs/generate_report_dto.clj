(ns партнерский-api-маркета.specs.generate-report-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-report-dto-data
  {
   (ds/req :reportId) string?
   (ds/req :estimatedGenerationTime) int?
   })

(def generate-report-dto-spec
  (ds/spec
    {:name ::generate-report-dto
     :spec generate-report-dto-data}))
