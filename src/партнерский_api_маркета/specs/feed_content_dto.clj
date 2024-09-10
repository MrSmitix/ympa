(ns партнерский-api-маркета.specs.feed-content-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-status-type :refer :all]
            [партнерский-api-маркета.specs.feed-content-error-dto :refer :all]
            )
  (:import (java.io File)))


(def feed-content-dto-data
  {
   (ds/opt :rejectedOffersCount) int?
   (ds/opt :status) feed-status-type-spec
   (ds/opt :totalOffersCount) int?
   (ds/opt :error) feed-content-error-dto-spec
   })

(def feed-content-dto-spec
  (ds/spec
    {:name ::feed-content-dto
     :spec feed-content-dto-data}))
