(ns партнерский-api-маркета.specs.get-report-info-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.report-info-dto :refer :all]
            )
  (:import (java.io File)))


(def get-report-info-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) report-info-dto-spec
   })

(def get-report-info-response-spec
  (ds/spec
    {:name ::get-report-info-response
     :spec get-report-info-response-data}))
