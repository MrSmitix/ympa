(ns партнерский-api-маркета.specs.get-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-dto :refer :all]
            [партнерский-api-маркета.specs.flipping-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-offers-response-data
  {
   (ds/req :offers) (s/coll-of offer-dto-spec)
   (ds/opt :pager) flipping-pager-dto-spec
   })

(def get-offers-response-spec
  (ds/spec
    {:name ::get-offers-response
     :spec get-offers-response-data}))
