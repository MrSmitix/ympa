(ns партнерский-api-маркета.specs.get-quarantine-offers-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.quarantine-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def get-quarantine-offers-result-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :offers) (s/coll-of quarantine-offer-dto-spec)
   })

(def get-quarantine-offers-result-dto-spec
  (ds/spec
    {:name ::get-quarantine-offers-result-dto
     :spec get-quarantine-offers-result-dto-data}))
