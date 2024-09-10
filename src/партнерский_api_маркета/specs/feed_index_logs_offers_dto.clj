(ns партнерский-api-маркета.specs.feed-index-logs-offers-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-index-logs-offers-dto-data
  {
   (ds/opt :rejectedCount) int?
   (ds/opt :totalCount) int?
   })

(def feed-index-logs-offers-dto-spec
  (ds/spec
    {:name ::feed-index-logs-offers-dto
     :spec feed-index-logs-offers-dto-data}))
