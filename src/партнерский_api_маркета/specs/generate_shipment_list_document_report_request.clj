(ns партнерский-api-маркета.specs.generate-shipment-list-document-report-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-shipment-list-document-report-request-data
  {
   (ds/req :campaignId) int?
   (ds/opt :shipmentId) int?
   (ds/opt :orderIds) (s/coll-of int?)
   })

(def generate-shipment-list-document-report-request-spec
  (ds/spec
    {:name ::generate-shipment-list-document-report-request
     :spec generate-shipment-list-document-report-request-data}))
