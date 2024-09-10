(ns партнерский-api-маркета.specs.feed-index-logs-index-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-index-logs-index-type-data
  {
   })

(def feed-index-logs-index-type-spec
  (ds/spec
    {:name ::feed-index-logs-index-type
     :spec feed-index-logs-index-type-data}))
