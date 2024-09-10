(ns партнерский-api-маркета.specs.delete-campaign-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-campaign-offers-request-data
  {
   (ds/req :offerIds) (s/coll-of string?)
   })

(def delete-campaign-offers-request-spec
  (ds/spec
    {:name ::delete-campaign-offers-request
     :spec delete-campaign-offers-request-data}))
