(ns партнерский-api-маркета.specs.promo-offer-auto-participating-details-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promo-offer-auto-participating-details-dto-data
  {
   (ds/opt :campaignIds) (s/coll-of int?)
   })

(def promo-offer-auto-participating-details-dto-spec
  (ds/spec
    {:name ::promo-offer-auto-participating-details-dto
     :spec promo-offer-auto-participating-details-dto-data}))
