(ns партнерский-api-маркета.specs.feed-download-error-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-download-error-type-data
  {
   })

(def feed-download-error-type-spec
  (ds/spec
    {:name ::feed-download-error-type
     :spec feed-download-error-type-data}))
