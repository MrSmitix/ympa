(ns партнерский-api-маркета.specs.offer-price-list-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-price-response-dto :refer :all]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-price-list-response-dto-data
  {
   (ds/req :offers) (s/coll-of offer-price-response-dto-spec)
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/opt :total) int?
   })

(def offer-price-list-response-dto-spec
  (ds/spec
    {:name ::offer-price-list-response-dto
     :spec offer-price-list-response-dto-data}))
