(ns партнерский-api-маркета.specs.get-all-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-dto :refer :all]
            )
  (:import (java.io File)))


(def get-all-offers-response-data
  {
   (ds/req :offers) (s/coll-of offer-dto-spec)
   })

(def get-all-offers-response-spec
  (ds/spec
    {:name ::get-all-offers-response
     :spec get-all-offers-response-data}))
