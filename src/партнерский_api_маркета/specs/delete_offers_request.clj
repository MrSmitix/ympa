(ns партнерский-api-маркета.specs.delete-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-offers-request-data
  {
   (ds/req :offerIds) (s/coll-of string?)
   })

(def delete-offers-request-spec
  (ds/spec
    {:name ::delete-offers-request
     :spec delete-offers-request-data}))
