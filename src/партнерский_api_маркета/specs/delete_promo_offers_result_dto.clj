(ns партнерский-api-маркета.specs.delete-promo-offers-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.rejected-promo-offer-delete-dto :refer :all]
            )
  (:import (java.io File)))


(def delete-promo-offers-result-dto-data
  {
   (ds/opt :rejectedOffers) (s/coll-of rejected-promo-offer-delete-dto-spec)
   })

(def delete-promo-offers-result-dto-spec
  (ds/spec
    {:name ::delete-promo-offers-result-dto
     :spec delete-promo-offers-result-dto-data}))
