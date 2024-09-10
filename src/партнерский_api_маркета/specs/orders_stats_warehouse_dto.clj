(ns партнерский-api-маркета.specs.orders-stats-warehouse-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-warehouse-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   })

(def orders-stats-warehouse-dto-spec
  (ds/spec
    {:name ::orders-stats-warehouse-dto
     :spec orders-stats-warehouse-dto-data}))
