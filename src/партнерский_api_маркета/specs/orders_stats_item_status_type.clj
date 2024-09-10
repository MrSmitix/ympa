(ns партнерский-api-маркета.specs.orders-stats-item-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-item-status-type-data
  {
   })

(def orders-stats-item-status-type-spec
  (ds/spec
    {:name ::orders-stats-item-status-type
     :spec orders-stats-item-status-type-data}))
