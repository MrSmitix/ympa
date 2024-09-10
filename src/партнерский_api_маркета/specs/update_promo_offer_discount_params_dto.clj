(ns партнерский-api-маркета.specs.update-promo-offer-discount-params-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-promo-offer-discount-params-dto-data
  {
   (ds/opt :price) int?
   (ds/opt :promoPrice) int?
   })

(def update-promo-offer-discount-params-dto-spec
  (ds/spec
    {:name ::update-promo-offer-discount-params-dto
     :spec update-promo-offer-discount-params-dto-data}))
