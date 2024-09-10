(ns партнерский-api-маркета.specs.generate-shelfs-statistics-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shelfs-statistics-attribution-type :refer :all]
            )
  (:import (java.io File)))


(def generate-shelfs-statistics-request-data
  {
   (ds/req :businessId) int?
   (ds/req :dateFrom) inst?
   (ds/req :dateTo) inst?
   (ds/req :attributionType) shelfs-statistics-attribution-type-spec
   })

(def generate-shelfs-statistics-request-spec
  (ds/spec
    {:name ::generate-shelfs-statistics-request
     :spec generate-shelfs-statistics-request-data}))
