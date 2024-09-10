(ns партнерский-api-маркета.specs.warning-promo-offer-update-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.promo-offer-update-warning-dto :refer :all]
            )
  (:import (java.io File)))


(def warning-promo-offer-update-dto-data
  {
   (ds/req :offerId) string?
   (ds/req :warnings) (s/coll-of promo-offer-update-warning-dto-spec)
   })

(def warning-promo-offer-update-dto-spec
  (ds/spec
    {:name ::warning-promo-offer-update-dto
     :spec warning-promo-offer-update-dto-data}))
