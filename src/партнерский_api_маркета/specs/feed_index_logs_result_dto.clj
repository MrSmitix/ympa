(ns партнерский-api-маркета.specs.feed-index-logs-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-index-logs-feed-dto :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-record-dto :refer :all]
            )
  (:import (java.io File)))


(def feed-index-logs-result-dto-data
  {
   (ds/opt :feed) feed-index-logs-feed-dto-spec
   (ds/req :indexLogRecords) (s/coll-of feed-index-logs-record-dto-spec)
   (ds/opt :total) int?
   })

(def feed-index-logs-result-dto-spec
  (ds/spec
    {:name ::feed-index-logs-result-dto
     :spec feed-index-logs-result-dto-data}))
