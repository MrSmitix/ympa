(ns партнерский-api-маркета.specs.get-campaign-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.quantum-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-with-discount-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-with-vat-dto :refer :all]
            [партнерский-api-маркета.specs.offer-campaign-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-error-dto :refer :all]
            [партнерский-api-маркета.specs.offer-error-dto :refer :all]
            )
  (:import (java.io File)))


(def get-campaign-offer-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :quantum) quantum-dto-spec
   (ds/opt :available) boolean?
   (ds/opt :basicPrice) get-price-with-discount-dto-spec
   (ds/opt :campaignPrice) get-price-with-vat-dto-spec
   (ds/opt :status) offer-campaign-status-type-spec
   (ds/opt :errors) (s/coll-of offer-error-dto-spec)
   (ds/opt :warnings) (s/coll-of offer-error-dto-spec)
   })

(def get-campaign-offer-dto-spec
  (ds/spec
    {:name ::get-campaign-offer-dto
     :spec get-campaign-offer-dto-data}))
