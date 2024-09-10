(ns партнерский-api-маркета.specs.feed-download-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-status-type :refer :all]
            [партнерский-api-маркета.specs.feed-download-error-dto :refer :all]
            )
  (:import (java.io File)))


(def feed-download-dto-data
  {
   (ds/opt :status) feed-status-type-spec
   (ds/opt :error) feed-download-error-dto-spec
   })

(def feed-download-dto-spec
  (ds/spec
    {:name ::feed-download-dto
     :spec feed-download-dto-data}))
