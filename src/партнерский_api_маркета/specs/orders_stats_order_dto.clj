(ns партнерский-api-маркета.specs.orders-stats-order-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-stats-status-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-order-payment-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-delivery-region-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-item-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-item-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-payment-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-commission-dto :refer :all]
            )
  (:import (java.io File)))


(def orders-stats-order-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :creationDate) inst?
   (ds/opt :statusUpdateDate) inst?
   (ds/opt :status) order-stats-status-type-spec
   (ds/opt :partnerOrderId) string?
   (ds/opt :paymentType) orders-stats-order-payment-type-spec
   (ds/opt :fake) boolean?
   (ds/opt :deliveryRegion) orders-stats-delivery-region-dto-spec
   (ds/req :items) (s/coll-of orders-stats-item-dto-spec)
   (ds/opt :initialItems) (s/coll-of orders-stats-item-dto-spec)
   (ds/req :payments) (s/coll-of orders-stats-payment-dto-spec)
   (ds/req :commissions) (s/coll-of orders-stats-commission-dto-spec)
   })

(def orders-stats-order-dto-spec
  (ds/spec
    {:name ::orders-stats-order-dto
     :spec orders-stats-order-dto-data}))
