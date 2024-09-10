(ns партнерский-api-маркета.specs.feed-download-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-download-error-type :refer :all]
            )
  (:import (java.io File)))


(def feed-download-error-dto-data
  {
   (ds/opt :httpStatusCode) int?
   (ds/opt :type) feed-download-error-type-spec
   (ds/opt :description) string?
   })

(def feed-download-error-dto-spec
  (ds/spec
    {:name ::feed-download-error-dto
     :spec feed-download-error-dto-data}))
