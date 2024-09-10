(ns партнерский-api-маркета.specs.order-delivery-partner-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-delivery-partner-type-data
  {
   })

(def order-delivery-partner-type-spec
  (ds/spec
    {:name ::order-delivery-partner-type
     :spec order-delivery-partner-type-data}))
