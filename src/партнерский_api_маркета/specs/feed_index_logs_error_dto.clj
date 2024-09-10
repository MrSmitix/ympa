(ns партнерский-api-маркета.specs.feed-index-logs-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-index-logs-error-type :refer :all]
            )
  (:import (java.io File)))


(def feed-index-logs-error-dto-data
  {
   (ds/opt :httpStatusCode) int?
   (ds/opt :type) feed-index-logs-error-type-spec
   (ds/opt :description) string?
   })

(def feed-index-logs-error-dto-spec
  (ds/spec
    {:name ::feed-index-logs-error-dto
     :spec feed-index-logs-error-dto-data}))
