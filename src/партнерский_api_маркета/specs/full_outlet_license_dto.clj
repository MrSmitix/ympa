(ns партнерский-api-маркета.specs.full-outlet-license-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.license-type :refer :all]
            [партнерский-api-маркета.specs.license-check-status-type :refer :all]
            )
  (:import (java.io File)))


(def full-outlet-license-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :outletId) int?
   (ds/opt :licenseType) license-type-spec
   (ds/opt :number) string?
   (ds/opt :dateOfIssue) inst?
   (ds/opt :dateOfExpiry) inst?
   (ds/opt :checkStatus) license-check-status-type-spec
   (ds/opt :checkComment) string?
   })

(def full-outlet-license-dto-spec
  (ds/spec
    {:name ::full-outlet-license-dto
     :spec full-outlet-license-dto-data}))
