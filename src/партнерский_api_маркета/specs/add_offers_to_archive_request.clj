(ns партнерский-api-маркета.specs.add-offers-to-archive-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def add-offers-to-archive-request-data
  {
   (ds/req :offerIds) (s/coll-of string?)
   })

(def add-offers-to-archive-request-spec
  (ds/spec
    {:name ::add-offers-to-archive-request
     :spec add-offers-to-archive-request-data}))
