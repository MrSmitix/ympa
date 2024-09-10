(ns партнерский-api-маркета.specs.delete-hidden-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.hidden-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def delete-hidden-offers-request-data
  {
   (ds/req :hiddenOffers) (s/coll-of hidden-offer-dto-spec)
   })

(def delete-hidden-offers-request-spec
  (ds/spec
    {:name ::delete-hidden-offers-request
     :spec delete-hidden-offers-request-data}))
