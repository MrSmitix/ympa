(ns партнерский-api-маркета.specs.get-campaign-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-campaign-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-campaign-offers-request-data
  {
   (ds/opt :offerIds) (s/coll-of string?)
   (ds/opt :statuses) (s/coll-of offer-campaign-status-type-spec)
   (ds/opt :categoryIds) (s/coll-of int?)
   (ds/opt :vendorNames) (s/coll-of string?)
   (ds/opt :tags) (s/coll-of string?)
   })

(def get-campaign-offers-request-spec
  (ds/spec
    {:name ::get-campaign-offers-request
     :spec get-campaign-offers-request-data}))
