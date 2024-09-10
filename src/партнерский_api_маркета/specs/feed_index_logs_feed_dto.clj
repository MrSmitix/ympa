(ns партнерский-api-маркета.specs.feed-index-logs-feed-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-index-logs-feed-dto-data
  {
   (ds/opt :id) int?
   })

(def feed-index-logs-feed-dto-spec
  (ds/spec
    {:name ::feed-index-logs-feed-dto
     :spec feed-index-logs-feed-dto-data}))
