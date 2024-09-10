(ns партнерский-api-маркета.specs.get-orders-stats-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-stats-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-orders-stats-request-data
  {
   (ds/opt :dateFrom) inst?
   (ds/opt :dateTo) inst?
   (ds/opt :updateFrom) inst?
   (ds/opt :updateTo) inst?
   (ds/opt :orders) (s/coll-of int?)
   (ds/opt :statuses) (s/coll-of order-stats-status-type-spec)
   (ds/opt :hasCis) boolean?
   })

(def get-orders-stats-request-spec
  (ds/spec
    {:name ::get-orders-stats-request
     :spec get-orders-stats-request-data}))
