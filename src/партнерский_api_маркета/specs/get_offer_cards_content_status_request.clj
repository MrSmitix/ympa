(ns партнерский-api-маркета.specs.get-offer-cards-content-status-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-card-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-offer-cards-content-status-request-data
  {
   (ds/opt :offerIds) (s/coll-of string?)
   (ds/opt :cardStatuses) (s/coll-of offer-card-status-type-spec)
   (ds/opt :categoryIds) (s/coll-of int?)
   })

(def get-offer-cards-content-status-request-spec
  (ds/spec
    {:name ::get-offer-cards-content-status-request
     :spec get-offer-cards-content-status-request-data}))
