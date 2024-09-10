(ns партнерский-api-маркета.specs.feed-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-status-type-data
  {
   })

(def feed-status-type-spec
  (ds/spec
    {:name ::feed-status-type
     :spec feed-status-type-data}))
