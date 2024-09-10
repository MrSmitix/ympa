(ns партнерский-api-маркета.specs.rejected-promo-offer-update-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.rejected-promo-offer-update-reason-type :refer :all]
            )
  (:import (java.io File)))


(def rejected-promo-offer-update-dto-data
  {
   (ds/req :offerId) string?
   (ds/req :reason) rejected-promo-offer-update-reason-type-spec
   })

(def rejected-promo-offer-update-dto-spec
  (ds/spec
    {:name ::rejected-promo-offer-update-dto
     :spec rejected-promo-offer-update-dto-data}))
