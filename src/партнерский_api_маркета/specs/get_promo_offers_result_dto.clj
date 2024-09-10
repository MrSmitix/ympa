(ns партнерский-api-маркета.specs.get-promo-offers-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.get-promo-offer-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-promo-offers-result-dto-data
  {
   (ds/req :offers) (s/coll-of get-promo-offer-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def get-promo-offers-result-dto-spec
  (ds/spec
    {:name ::get-promo-offers-result-dto
     :spec get-promo-offers-result-dto-data}))
