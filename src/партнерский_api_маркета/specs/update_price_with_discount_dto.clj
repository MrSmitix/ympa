(ns партнерский-api-маркета.specs.update-price-with-discount-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def update-price-with-discount-dto-data
  {
   (ds/req :value) float?
   (ds/req :currencyId) currency-type-spec
   (ds/opt :discountBase) float?
   })

(def update-price-with-discount-dto-spec
  (ds/spec
    {:name ::update-price-with-discount-dto
     :spec update-price-with-discount-dto-data}))
