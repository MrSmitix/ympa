(ns партнерский-api-маркета.specs.base-price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def base-price-dto-data
  {
   (ds/req :value) float?
   (ds/req :currencyId) currency-type-spec
   })

(def base-price-dto-spec
  (ds/spec
    {:name ::base-price-dto
     :spec base-price-dto-data}))
