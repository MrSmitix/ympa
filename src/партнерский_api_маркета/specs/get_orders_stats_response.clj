(ns партнерский-api-маркета.specs.get-orders-stats-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-dto :refer :all]
            )
  (:import (java.io File)))


(def get-orders-stats-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) orders-stats-dto-spec
   })

(def get-orders-stats-response-spec
  (ds/spec
    {:name ::get-orders-stats-response
     :spec get-orders-stats-response-data}))
