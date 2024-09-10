(ns партнерский-api-маркета.specs.update-promo-offer-params-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-promo-offer-discount-params-dto :refer :all]
            )
  (:import (java.io File)))


(def update-promo-offer-params-dto-data
  {
   (ds/opt :discountParams) update-promo-offer-discount-params-dto-spec
   })

(def update-promo-offer-params-dto-spec
  (ds/spec
    {:name ::update-promo-offer-params-dto
     :spec update-promo-offer-params-dto-data}))
