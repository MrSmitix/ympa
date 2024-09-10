(ns партнерский-api-маркета.specs.warehouse-offers-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.warehouse-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def warehouse-offers-dto-data
  {
   (ds/req :warehouseId) int?
   (ds/req :offers) (s/coll-of warehouse-offer-dto-spec)
   })

(def warehouse-offers-dto-spec
  (ds/spec
    {:name ::warehouse-offers-dto
     :spec warehouse-offers-dto-data}))
