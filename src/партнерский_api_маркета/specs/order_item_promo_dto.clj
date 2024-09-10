(ns партнерский-api-маркета.specs.order-item-promo-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-promo-type :refer :all]
            )
  (:import (java.io File)))


(def order-item-promo-dto-data
  {
   (ds/req :type) order-promo-type-spec
   (ds/opt :discount) float?
   (ds/opt :subsidy) float?
   (ds/opt :shopPromoId) string?
   (ds/opt :marketPromoId) string?
   })

(def order-item-promo-dto-spec
  (ds/spec
    {:name ::order-item-promo-dto
     :spec order-item-promo-dto-data}))
