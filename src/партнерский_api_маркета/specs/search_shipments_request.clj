(ns партнерский-api-маркета.specs.search-shipments-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shipment-status-type :refer :all]
            )
  (:import (java.io File)))


(def search-shipments-request-data
  {
   (ds/req :dateFrom) inst?
   (ds/req :dateTo) inst?
   (ds/opt :statuses) (s/coll-of shipment-status-type-spec)
   (ds/opt :orderIds) (s/coll-of int?)
   (ds/opt :cancelledOrders) boolean?
   })

(def search-shipments-request-spec
  (ds/spec
    {:name ::search-shipments-request
     :spec search-shipments-request-data}))
