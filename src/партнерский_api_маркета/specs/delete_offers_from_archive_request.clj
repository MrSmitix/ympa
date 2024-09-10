(ns партнерский-api-маркета.specs.delete-offers-from-archive-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-offers-from-archive-request-data
  {
   (ds/req :offerIds) (s/coll-of string?)
   })

(def delete-offers-from-archive-request-spec
  (ds/spec
    {:name ::delete-offers-from-archive-request
     :spec delete-offers-from-archive-request-data}))
