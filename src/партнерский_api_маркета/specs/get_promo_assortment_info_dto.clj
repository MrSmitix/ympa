(ns партнерский-api-маркета.specs.get-promo-assortment-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-promo-assortment-info-dto-data
  {
   (ds/req :activeOffers) int?
   (ds/opt :potentialOffers) int?
   (ds/opt :processing) boolean?
   })

(def get-promo-assortment-info-dto-spec
  (ds/spec
    {:name ::get-promo-assortment-info-dto
     :spec get-promo-assortment-info-dto-data}))
