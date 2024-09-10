(ns партнерский-api-маркета.specs.offers-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-dto :refer :all]
            )
  (:import (java.io File)))


(def offers-dto-data
  {
   (ds/req :offers) (s/coll-of offer-dto-spec)
   })

(def offers-dto-spec
  (ds/spec
    {:name ::offers-dto
     :spec offers-dto-data}))
