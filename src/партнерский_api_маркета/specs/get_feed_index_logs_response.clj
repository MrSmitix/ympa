(ns партнерский-api-маркета.specs.get-feed-index-logs-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-feed-index-logs-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) feed-index-logs-result-dto-spec
   })

(def get-feed-index-logs-response-spec
  (ds/spec
    {:name ::get-feed-index-logs-response
     :spec get-feed-index-logs-response-data}))
