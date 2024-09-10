(ns партнерский-api-маркета.specs.orders-stats-stock-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-stock-type-data
  {
   })

(def orders-stats-stock-type-spec
  (ds/spec
    {:name ::orders-stats-stock-type
     :spec orders-stats-stock-type-data}))
