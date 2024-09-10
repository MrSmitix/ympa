(ns партнерский-api-маркета.specs.promo-offer-params-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.promo-offer-discount-params-dto :refer :all]
            [партнерский-api-маркета.specs.promo-offer-promocode-params-dto :refer :all]
            )
  (:import (java.io File)))


(def promo-offer-params-dto-data
  {
   (ds/opt :discountParams) promo-offer-discount-params-dto-spec
   (ds/opt :promocodeParams) promo-offer-promocode-params-dto-spec
   })

(def promo-offer-params-dto-spec
  (ds/spec
    {:name ::promo-offer-params-dto
     :spec promo-offer-params-dto-data}))
