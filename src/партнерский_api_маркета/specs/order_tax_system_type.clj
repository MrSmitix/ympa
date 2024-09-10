(ns партнерский-api-маркета.specs.order-tax-system-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-tax-system-type-data
  {
   })

(def order-tax-system-type-spec
  (ds/spec
    {:name ::order-tax-system-type
     :spec order-tax-system-type-data}))
