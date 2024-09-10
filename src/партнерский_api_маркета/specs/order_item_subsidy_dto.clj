(ns партнерский-api-маркета.specs.order-item-subsidy-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-item-subsidy-type :refer :all]
            )
  (:import (java.io File)))


(def order-item-subsidy-dto-data
  {
   (ds/opt :type) order-item-subsidy-type-spec
   (ds/opt :amount) float?
   })

(def order-item-subsidy-dto-spec
  (ds/spec
    {:name ::order-item-subsidy-dto
     :spec order-item-subsidy-dto-data}))
