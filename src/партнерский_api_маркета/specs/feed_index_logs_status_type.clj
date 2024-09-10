(ns партнерский-api-маркета.specs.feed-index-logs-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-index-logs-status-type-data
  {
   })

(def feed-index-logs-status-type-spec
  (ds/spec
    {:name ::feed-index-logs-status-type
     :spec feed-index-logs-status-type-data}))
