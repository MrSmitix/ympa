(ns партнерский-api-маркета.specs.order-item-instance-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-item-instance-type-data
  {
   })

(def order-item-instance-type-spec
  (ds/spec
    {:name ::order-item-instance-type
     :spec order-item-instance-type-data}))
