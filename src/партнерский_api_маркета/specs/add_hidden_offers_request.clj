(ns партнерский-api-маркета.specs.add-hidden-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.hidden-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def add-hidden-offers-request-data
  {
   (ds/req :hiddenOffers) (s/coll-of hidden-offer-dto-spec)
   })

(def add-hidden-offers-request-spec
  (ds/spec
    {:name ::add-hidden-offers-request
     :spec add-hidden-offers-request-data}))
