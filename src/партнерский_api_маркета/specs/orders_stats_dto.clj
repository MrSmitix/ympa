(ns партнерский-api-маркета.specs.orders-stats-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.orders-stats-order-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def orders-stats-dto-data
  {
   (ds/req :orders) (s/coll-of orders-stats-order-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def orders-stats-dto-spec
  (ds/spec
    {:name ::orders-stats-dto
     :spec orders-stats-dto-data}))
