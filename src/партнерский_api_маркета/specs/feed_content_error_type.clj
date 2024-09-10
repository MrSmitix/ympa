(ns партнерский-api-маркета.specs.feed-content-error-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-content-error-type-data
  {
   })

(def feed-content-error-type-spec
  (ds/spec
    {:name ::feed-content-error-type
     :spec feed-content-error-type-data}))
