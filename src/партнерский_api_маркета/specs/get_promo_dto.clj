(ns партнерский-api-маркета.specs.get-promo-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.promo-period-dto :refer :all]
            [партнерский-api-маркета.specs.get-promo-assortment-info-dto :refer :all]
            [партнерский-api-маркета.specs.get-promo-mechanics-info-dto :refer :all]
            [партнерский-api-маркета.specs.get-promo-bestseller-info-dto :refer :all]
            [партнерский-api-маркета.specs.channel-type :refer :all]
            [партнерский-api-маркета.specs.get-promo-constraints-dto :refer :all]
            )
  (:import (java.io File)))


(def get-promo-dto-data
  {
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :period) promo-period-dto-spec
   (ds/req :participating) boolean?
   (ds/req :assortmentInfo) get-promo-assortment-info-dto-spec
   (ds/req :mechanicsInfo) get-promo-mechanics-info-dto-spec
   (ds/req :bestsellerInfo) get-promo-bestseller-info-dto-spec
   (ds/opt :channels) (s/coll-of channel-type-spec)
   (ds/opt :constraints) get-promo-constraints-dto-spec
   })

(def get-promo-dto-spec
  (ds/spec
    {:name ::get-promo-dto
     :spec get-promo-dto-data}))
