(ns партнерский-api-маркета.specs.orders-stats-details-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.orders-stats-item-status-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-stock-type :refer :all]
            )
  (:import (java.io File)))


(def orders-stats-details-dto-data
  {
   (ds/opt :itemStatus) orders-stats-item-status-type-spec
   (ds/opt :itemCount) int?
   (ds/opt :updateDate) inst?
   (ds/opt :stockType) orders-stats-stock-type-spec
   })

(def orders-stats-details-dto-spec
  (ds/spec
    {:name ::orders-stats-details-dto
     :spec orders-stats-details-dto-data}))
