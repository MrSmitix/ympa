(ns партнерский-api-маркета.specs.update-promo-offers-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.rejected-promo-offer-update-dto :refer :all]
            [партнерский-api-маркета.specs.warning-promo-offer-update-dto :refer :all]
            )
  (:import (java.io File)))


(def update-promo-offers-result-dto-data
  {
   (ds/opt :rejectedOffers) (s/coll-of rejected-promo-offer-update-dto-spec)
   (ds/opt :warningOffers) (s/coll-of warning-promo-offer-update-dto-spec)
   })

(def update-promo-offers-result-dto-spec
  (ds/spec
    {:name ::update-promo-offers-result-dto
     :spec update-promo-offers-result-dto-data}))
