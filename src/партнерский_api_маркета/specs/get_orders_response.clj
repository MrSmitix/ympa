(ns партнерский-api-маркета.specs.get-orders-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.flipping-pager-dto :refer :all]
            [партнерский-api-маркета.specs.order-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-orders-response-data
  {
   (ds/opt :pager) flipping-pager-dto-spec
   (ds/req :orders) (s/coll-of order-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def get-orders-response-spec
  (ds/spec
    {:name ::get-orders-response
     :spec get-orders-response-data}))
