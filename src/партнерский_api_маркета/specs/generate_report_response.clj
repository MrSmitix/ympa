(ns партнерский-api-маркета.specs.generate-report-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.generate-report-dto :refer :all]
            )
  (:import (java.io File)))


(def generate-report-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) generate-report-dto-spec
   })

(def generate-report-response-spec
  (ds/spec
    {:name ::generate-report-response
     :spec generate-report-response-data}))
