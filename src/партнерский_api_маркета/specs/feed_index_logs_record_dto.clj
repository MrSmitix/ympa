(ns партнерский-api-маркета.specs.feed-index-logs-record-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-index-logs-index-type :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-status-type :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-error-dto :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-offers-dto :refer :all]
            )
  (:import (java.io File)))


(def feed-index-logs-record-dto-data
  {
   (ds/opt :downloadTime) inst?
   (ds/opt :fileTime) inst?
   (ds/opt :generationId) int?
   (ds/opt :indexType) feed-index-logs-index-type-spec
   (ds/opt :publishedTime) inst?
   (ds/opt :status) feed-index-logs-status-type-spec
   (ds/opt :error) feed-index-logs-error-dto-spec
   (ds/opt :offers) feed-index-logs-offers-dto-spec
   })

(def feed-index-logs-record-dto-spec
  (ds/spec
    {:name ::feed-index-logs-record-dto
     :spec feed-index-logs-record-dto-data}))
