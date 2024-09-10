(ns партнерский-api-маркета.specs.order-subsidy-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-subsidy-type :refer :all]
            )
  (:import (java.io File)))


(def order-subsidy-dto-data
  {
   (ds/opt :type) order-subsidy-type-spec
   (ds/opt :amount) float?
   })

(def order-subsidy-dto-spec
  (ds/spec
    {:name ::order-subsidy-dto
     :spec order-subsidy-dto-data}))
