(ns партнерский-api-маркета.specs.order-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-status-type-data
  {
   })

(def order-status-type-spec
  (ds/spec
    {:name ::order-status-type
     :spec order-status-type-data}))
