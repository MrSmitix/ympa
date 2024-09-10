(ns партнерский-api-маркета.specs.get-price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def get-price-dto-data
  {
   (ds/req :value) float?
   (ds/req :currencyId) currency-type-spec
   (ds/req :updatedAt) inst?
   })

(def get-price-dto-spec
  (ds/spec
    {:name ::get-price-dto
     :spec get-price-dto-data}))
