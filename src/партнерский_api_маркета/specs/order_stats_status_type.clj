(ns партнерский-api-маркета.specs.order-stats-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-stats-status-type-data
  {
   })

(def order-stats-status-type-spec
  (ds/spec
    {:name ::order-stats-status-type
     :spec order-stats-status-type-data}))
