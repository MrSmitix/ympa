(ns партнерский-api-маркета.specs.promo-offer-update-warning-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.promo-offer-update-warning-code-type :refer :all]
            )
  (:import (java.io File)))


(def promo-offer-update-warning-dto-data
  {
   (ds/req :code) promo-offer-update-warning-code-type-spec
   (ds/opt :campaignIds) (s/coll-of int?)
   })

(def promo-offer-update-warning-dto-spec
  (ds/spec
    {:name ::promo-offer-update-warning-dto
     :spec promo-offer-update-warning-dto-data}))
