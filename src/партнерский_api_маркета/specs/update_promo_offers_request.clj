(ns партнерский-api-маркета.specs.update-promo-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-promo-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def update-promo-offers-request-data
  {
   (ds/req :promoId) string?
   (ds/req :offers) (s/coll-of update-promo-offer-dto-spec)
   })

(def update-promo-offers-request-spec
  (ds/spec
    {:name ::update-promo-offers-request
     :spec update-promo-offers-request-data}))
