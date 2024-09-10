(ns партнерский-api-маркета.specs.get-promo-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.promo-offer-participation-status-filter-type :refer :all]
            )
  (:import (java.io File)))


(def get-promo-offers-request-data
  {
   (ds/req :promoId) string?
   (ds/opt :statusType) promo-offer-participation-status-filter-type-spec
   })

(def get-promo-offers-request-spec
  (ds/spec
    {:name ::get-promo-offers-request
     :spec get-promo-offers-request-data}))
