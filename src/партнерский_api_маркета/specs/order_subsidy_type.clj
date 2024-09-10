(ns партнерский-api-маркета.specs.order-subsidy-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-subsidy-type-data
  {
   })

(def order-subsidy-type-spec
  (ds/spec
    {:name ::order-subsidy-type
     :spec order-subsidy-type-data}))
