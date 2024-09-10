(ns партнерский-api-маркета.specs.get-offer-mappings-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-card-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-offer-mappings-request-data
  {
   (ds/opt :offerIds) (s/coll-of string?)
   (ds/opt :cardStatuses) (s/coll-of offer-card-status-type-spec)
   (ds/opt :categoryIds) (s/coll-of int?)
   (ds/opt :vendorNames) (s/coll-of string?)
   (ds/opt :tags) (s/coll-of string?)
   (ds/opt :archived) boolean?
   })

(def get-offer-mappings-request-spec
  (ds/spec
    {:name ::get-offer-mappings-request
     :spec get-offer-mappings-request-data}))
