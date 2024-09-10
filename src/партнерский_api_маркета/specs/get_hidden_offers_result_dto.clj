(ns партнерский-api-маркета.specs.get-hidden-offers-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.hidden-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def get-hidden-offers-result-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :hiddenOffers) (s/coll-of hidden-offer-dto-spec)
   })

(def get-hidden-offers-result-dto-spec
  (ds/spec
    {:name ::get-hidden-offers-result-dto
     :spec get-hidden-offers-result-dto-data}))
