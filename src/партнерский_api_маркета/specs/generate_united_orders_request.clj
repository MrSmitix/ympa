(ns партнерский-api-маркета.specs.generate-united-orders-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-united-orders-request-data
  {
   (ds/req :businessId) int?
   (ds/req :dateFrom) inst?
   (ds/req :dateTo) inst?
   (ds/opt :campaignIds) (s/coll-of int?)
   (ds/opt :promoId) string?
   })

(def generate-united-orders-request-spec
  (ds/spec
    {:name ::generate-united-orders-request
     :spec generate-united-orders-request-data}))
