(ns партнерский-api-маркета.specs.offer-price-by-offer-ids-list-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-price-by-offer-ids-response-dto :refer :all]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-price-by-offer-ids-list-response-dto-data
  {
   (ds/req :offers) (s/coll-of offer-price-by-offer-ids-response-dto-spec)
   (ds/opt :paging) scrolling-pager-dto-spec
   })

(def offer-price-by-offer-ids-list-response-dto-spec
  (ds/spec
    {:name ::offer-price-by-offer-ids-list-response-dto
     :spec offer-price-by-offer-ids-list-response-dto-data}))
