(ns партнерский-api-маркета.specs.order-item-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-item-status-type-data
  {
   })

(def order-item-status-type-spec
  (ds/spec
    {:name ::order-item-status-type
     :spec order-item-status-type-data}))
