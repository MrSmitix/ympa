(ns партнерский-api-маркета.specs.get-quarantine-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-card-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-quarantine-offers-request-data
  {
   (ds/opt :offerIds) (s/coll-of string?)
   (ds/opt :cardStatuses) (s/coll-of offer-card-status-type-spec)
   (ds/opt :categoryIds) (s/coll-of int?)
   (ds/opt :vendorNames) (s/coll-of string?)
   (ds/opt :tags) (s/coll-of string?)
   })

(def get-quarantine-offers-request-spec
  (ds/spec
    {:name ::get-quarantine-offers-request
     :spec get-quarantine-offers-request-data}))
