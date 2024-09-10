(ns партнерский-api-маркета.specs.offer-cards-content-status-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-card-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-cards-content-status-dto-data
  {
   (ds/req :offerCards) (s/coll-of offer-card-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def offer-cards-content-status-dto-spec
  (ds/spec
    {:name ::offer-cards-content-status-dto
     :spec offer-cards-content-status-dto-data}))
