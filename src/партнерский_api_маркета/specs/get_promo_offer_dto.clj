(ns партнерский-api-маркета.specs.get-promo-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.promo-offer-participation-status-type :refer :all]
            [партнерский-api-маркета.specs.promo-offer-params-dto :refer :all]
            [партнерский-api-маркета.specs.promo-offer-auto-participating-details-dto :refer :all]
            )
  (:import (java.io File)))


(def get-promo-offer-dto-data
  {
   (ds/req :offerId) string?
   (ds/req :status) promo-offer-participation-status-type-spec
   (ds/req :params) promo-offer-params-dto-spec
   (ds/opt :autoParticipatingDetails) promo-offer-auto-participating-details-dto-spec
   })

(def get-promo-offer-dto-spec
  (ds/spec
    {:name ::get-promo-offer-dto
     :spec get-promo-offer-dto-data}))
