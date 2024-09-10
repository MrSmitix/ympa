(ns партнерский-api-маркета.specs.outlet-license-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.license-type :refer :all]
            )
  (:import (java.io File)))


(def outlet-license-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :outletId) int?
   (ds/opt :licenseType) license-type-spec
   (ds/opt :number) string?
   (ds/opt :dateOfIssue) inst?
   (ds/opt :dateOfExpiry) inst?
   })

(def outlet-license-dto-spec
  (ds/spec
    {:name ::outlet-license-dto
     :spec outlet-license-dto-data}))
