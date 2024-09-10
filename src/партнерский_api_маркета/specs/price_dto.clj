(ns партнерский-api-маркета.specs.price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def price-dto-data
  {
   (ds/opt :value) float?
   (ds/opt :discountBase) float?
   (ds/opt :currencyId) currency-type-spec
   (ds/opt :vat) int?
   })

(def price-dto-spec
  (ds/spec
    {:name ::price-dto
     :spec price-dto-data}))
