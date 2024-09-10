(ns партнерский-api-маркета.specs.order-update-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-update-status-type-data
  {
   })

(def order-update-status-type-spec
  (ds/spec
    {:name ::order-update-status-type
     :spec order-update-status-type-data}))
