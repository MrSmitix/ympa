(ns партнерский-api-маркета.specs.update-promo-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-promo-offer-params-dto :refer :all]
            )
  (:import (java.io File)))


(def update-promo-offer-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :params) update-promo-offer-params-dto-spec
   })

(def update-promo-offer-dto-spec
  (ds/spec
    {:name ::update-promo-offer-dto
     :spec update-promo-offer-dto-data}))
