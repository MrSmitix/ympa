(ns партнерский-api-маркета.specs.order-delivery-eac-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-delivery-eac-type-data
  {
   })

(def order-delivery-eac-type-spec
  (ds/spec
    {:name ::order-delivery-eac-type
     :spec order-delivery-eac-type-data}))
