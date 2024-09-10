(ns партнерский-api-маркета.specs.order-delivery-dispatch-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-delivery-dispatch-type-data
  {
   })

(def order-delivery-dispatch-type-spec
  (ds/spec
    {:name ::order-delivery-dispatch-type
     :spec order-delivery-dispatch-type-data}))
