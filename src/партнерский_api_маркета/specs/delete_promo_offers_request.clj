(ns партнерский-api-маркета.specs.delete-promo-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-promo-offers-request-data
  {
   (ds/req :promoId) string?
   (ds/opt :deleteAllOffers) boolean?
   (ds/opt :offerIds) (s/coll-of string?)
   })

(def delete-promo-offers-request-spec
  (ds/spec
    {:name ::delete-promo-offers-request
     :spec delete-promo-offers-request-data}))
