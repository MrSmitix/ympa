(ns партнерский-api-маркета.specs.get-campaign-offers-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.get-campaign-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def get-campaign-offers-result-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :offers) (s/coll-of get-campaign-offer-dto-spec)
   })

(def get-campaign-offers-result-dto-spec
  (ds/spec
    {:name ::get-campaign-offers-result-dto
     :spec get-campaign-offers-result-dto-data}))
