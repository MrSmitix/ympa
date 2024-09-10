(ns партнерский-api-маркета.specs.order-vat-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-vat-type-data
  {
   })

(def order-vat-type-spec
  (ds/spec
    {:name ::order-vat-type
     :spec order-vat-type-data}))
