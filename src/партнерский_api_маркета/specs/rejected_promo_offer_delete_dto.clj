(ns партнерский-api-маркета.specs.rejected-promo-offer-delete-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.rejected-promo-offer-delete-reason-type :refer :all]
            )
  (:import (java.io File)))


(def rejected-promo-offer-delete-dto-data
  {
   (ds/req :offerId) string?
   (ds/req :reason) rejected-promo-offer-delete-reason-type-spec
   })

(def rejected-promo-offer-delete-dto-spec
  (ds/spec
    {:name ::rejected-promo-offer-delete-dto
     :spec rejected-promo-offer-delete-dto-data}))
