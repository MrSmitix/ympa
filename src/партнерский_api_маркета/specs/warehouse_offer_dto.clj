(ns партнерский-api-маркета.specs.warehouse-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.turnover-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-stock-dto :refer :all]
            )
  (:import (java.io File)))


(def warehouse-offer-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :turnoverSummary) turnover-dto-spec
   (ds/req :stocks) (s/coll-of warehouse-stock-dto-spec)
   (ds/opt :updatedAt) inst?
   })

(def warehouse-offer-dto-spec
  (ds/spec
    {:name ::warehouse-offer-dto
     :spec warehouse-offer-dto-data}))
