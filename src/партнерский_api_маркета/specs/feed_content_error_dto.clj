(ns партнерский-api-маркета.specs.feed-content-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-content-error-type :refer :all]
            )
  (:import (java.io File)))


(def feed-content-error-dto-data
  {
   (ds/opt :type) feed-content-error-type-spec
   })

(def feed-content-error-dto-spec
  (ds/spec
    {:name ::feed-content-error-dto
     :spec feed-content-error-dto-data}))
