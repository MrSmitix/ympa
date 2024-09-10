(ns партнерский-api-маркета.specs.order-delivery-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-delivery-type-data
  {
   })

(def order-delivery-type-spec
  (ds/spec
    {:name ::order-delivery-type
     :spec order-delivery-type-data}))
