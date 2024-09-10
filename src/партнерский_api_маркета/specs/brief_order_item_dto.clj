(ns партнерский-api-маркета.specs.brief-order-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-vat-type :refer :all]
            [партнерский-api-маркета.specs.order-item-instance-dto :refer :all]
            )
  (:import (java.io File)))


(def brief-order-item-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :vat) order-vat-type-spec
   (ds/opt :count) int?
   (ds/opt :price) float?
   (ds/opt :offerName) string?
   (ds/opt :offerId) string?
   (ds/opt :instances) (s/coll-of order-item-instance-dto-spec)
   })

(def brief-order-item-dto-spec
  (ds/spec
    {:name ::brief-order-item-dto
     :spec brief-order-item-dto-data}))
