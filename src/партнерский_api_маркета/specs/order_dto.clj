(ns партнерский-api-маркета.specs.order-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-status-type :refer :all]
            [партнерский-api-маркета.specs.order-substatus-type :refer :all]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            [партнерский-api-маркета.specs.order-payment-type :refer :all]
            [партнерский-api-маркета.specs.order-payment-method-type :refer :all]
            [партнерский-api-маркета.specs.order-item-dto :refer :all]
            [партнерский-api-маркета.specs.order-subsidy-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-dto :refer :all]
            [партнерский-api-маркета.specs.order-buyer-dto :refer :all]
            [партнерский-api-маркета.specs.order-tax-system-type :refer :all]
            )
  (:import (java.io File)))


(def order-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :status) order-status-type-spec
   (ds/opt :substatus) order-substatus-type-spec
   (ds/opt :creationDate) string?
   (ds/opt :updatedAt) string?
   (ds/opt :currency) currency-type-spec
   (ds/opt :itemsTotal) float?
   (ds/opt :deliveryTotal) float?
   (ds/opt :buyerItemsTotal) float?
   (ds/opt :buyerTotal) float?
   (ds/opt :buyerItemsTotalBeforeDiscount) float?
   (ds/opt :buyerTotalBeforeDiscount) float?
   (ds/opt :paymentType) order-payment-type-spec
   (ds/opt :paymentMethod) order-payment-method-type-spec
   (ds/opt :fake) boolean?
   (ds/req :items) (s/coll-of order-item-dto-spec)
   (ds/opt :subsidies) (s/coll-of order-subsidy-dto-spec)
   (ds/opt :delivery) order-delivery-dto-spec
   (ds/opt :buyer) order-buyer-dto-spec
   (ds/opt :notes) string?
   (ds/opt :taxSystem) order-tax-system-type-spec
   (ds/opt :cancelRequested) boolean?
   (ds/opt :expiryDate) string?
   })

(def order-dto-spec
  (ds/spec
    {:name ::order-dto
     :spec order-dto-data}))
