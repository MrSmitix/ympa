(ns партнерский-api-маркета.specs.feed-placement-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-status-type :refer :all]
            )
  (:import (java.io File)))


(def feed-placement-dto-data
  {
   (ds/opt :status) feed-status-type-spec
   (ds/opt :totalOffersCount) int?
   })

(def feed-placement-dto-spec
  (ds/spec
    {:name ::feed-placement-dto
     :spec feed-placement-dto-data}))
