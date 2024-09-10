(ns партнерский-api-маркета.specs.get-price-with-discount-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def get-price-with-discount-dto-data
  {
   (ds/req :value) float?
   (ds/req :currencyId) currency-type-spec
   (ds/opt :discountBase) float?
   (ds/req :updatedAt) inst?
   })

(def get-price-with-discount-dto-spec
  (ds/spec
    {:name ::get-price-with-discount-dto
     :spec get-price-with-discount-dto-data}))
