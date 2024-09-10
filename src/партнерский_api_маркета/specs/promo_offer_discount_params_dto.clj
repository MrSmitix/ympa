(ns партнерский-api-маркета.specs.promo-offer-discount-params-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promo-offer-discount-params-dto-data
  {
   (ds/opt :price) int?
   (ds/opt :promoPrice) int?
   (ds/req :maxPromoPrice) int?
   })

(def promo-offer-discount-params-dto-spec
  (ds/spec
    {:name ::promo-offer-discount-params-dto
     :spec promo-offer-discount-params-dto-data}))
