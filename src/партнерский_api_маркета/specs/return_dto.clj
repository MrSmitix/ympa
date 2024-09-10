(ns партнерский-api-маркета.specs.return-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.refund-status-type :refer :all]
            [партнерский-api-маркета.specs.logistic-pickup-point-dto :refer :all]
            [партнерский-api-маркета.specs.recipient-type :refer :all]
            [партнерский-api-маркета.specs.return-shipment-status-type :refer :all]
            [партнерский-api-маркета.specs.return-item-dto :refer :all]
            [партнерский-api-маркета.specs.return-type :refer :all]
            )
  (:import (java.io File)))


(def return-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :orderId) int?
   (ds/opt :creationDate) inst?
   (ds/opt :updateDate) inst?
   (ds/opt :refundStatus) refund-status-type-spec
   (ds/opt :logisticPickupPoint) logistic-pickup-point-dto-spec
   (ds/opt :shipmentRecipientType) recipient-type-spec
   (ds/opt :shipmentStatus) return-shipment-status-type-spec
   (ds/opt :refundAmount) int?
   (ds/req :items) (s/coll-of return-item-dto-spec)
   (ds/opt :returnType) return-type-spec
   (ds/opt :fastReturn) boolean?
   })

(def return-dto-spec
  (ds/spec
    {:name ::return-dto
     :spec return-dto-data}))
