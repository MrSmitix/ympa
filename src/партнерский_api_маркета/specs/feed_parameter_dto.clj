(ns партнерский-api-маркета.specs.feed-parameter-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-parameter-dto-data
  {
   (ds/opt :deleted) boolean?
   (ds/req :name) string?
   (ds/opt :values) (s/coll-of int?)
   })

(def feed-parameter-dto-spec
  (ds/spec
    {:name ::feed-parameter-dto
     :spec feed-parameter-dto-data}))
