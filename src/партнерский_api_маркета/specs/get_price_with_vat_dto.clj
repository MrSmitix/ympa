(ns партнерский-api-маркета.specs.get-price-with-vat-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def get-price-with-vat-dto-data
  {
   (ds/opt :value) float?
   (ds/opt :discountBase) float?
   (ds/opt :currencyId) currency-type-spec
   (ds/opt :vat) int?
   (ds/req :updatedAt) inst?
   })

(def get-price-with-vat-dto-spec
  (ds/spec
    {:name ::get-price-with-vat-dto
     :spec get-price-with-vat-dto-data}))
