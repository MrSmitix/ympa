(ns партнерский-api-маркета.specs.order-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-vat-type :refer :all]
            [партнерский-api-маркета.specs.order-item-promo-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-instance-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-detail-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-subsidy-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-instance-type :refer :all]
            )
  (:import (java.io File)))


(def order-item-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :offerId) string?
   (ds/opt :offerName) string?
   (ds/opt :price) float?
   (ds/opt :buyerPrice) float?
   (ds/opt :buyerPriceBeforeDiscount) float?
   (ds/opt :priceBeforeDiscount) float?
   (ds/opt :count) int?
   (ds/opt :vat) order-vat-type-spec
   (ds/opt :shopSku) string?
   (ds/opt :subsidy) float?
   (ds/opt :partnerWarehouseId) string?
   (ds/opt :promos) (s/coll-of order-item-promo-dto-spec)
   (ds/opt :instances) (s/coll-of order-item-instance-dto-spec)
   (ds/opt :details) (s/coll-of order-item-detail-dto-spec)
   (ds/opt :subsidies) (s/coll-of order-item-subsidy-dto-spec)
   (ds/opt :requiredInstanceTypes) (s/coll-of order-item-instance-type-spec)
   })

(def order-item-dto-spec
  (ds/spec
    {:name ::order-item-dto
     :spec order-item-dto-data}))
