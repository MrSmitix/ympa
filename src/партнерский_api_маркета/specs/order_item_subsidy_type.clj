(ns партнерский-api-маркета.specs.order-item-subsidy-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-item-subsidy-type-data
  {
   })

(def order-item-subsidy-type-spec
  (ds/spec
    {:name ::order-item-subsidy-type
     :spec order-item-subsidy-type-data}))
