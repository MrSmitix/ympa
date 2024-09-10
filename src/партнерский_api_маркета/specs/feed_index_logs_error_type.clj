(ns партнерский-api-маркета.specs.feed-index-logs-error-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-index-logs-error-type-data
  {
   })

(def feed-index-logs-error-type-spec
  (ds/spec
    {:name ::feed-index-logs-error-type
     :spec feed-index-logs-error-type-data}))
