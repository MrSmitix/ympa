(ns партнерский-api-маркета.specs.promo-offer-promocode-params-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promo-offer-promocode-params-dto-data
  {
   (ds/req :maxPrice) int?
   })

(def promo-offer-promocode-params-dto-spec
  (ds/spec
    {:name ::promo-offer-promocode-params-dto
     :spec promo-offer-promocode-params-dto-data}))
