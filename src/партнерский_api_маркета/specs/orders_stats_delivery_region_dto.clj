(ns партнерский-api-маркета.specs.orders-stats-delivery-region-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-delivery-region-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   })

(def orders-stats-delivery-region-dto-spec
  (ds/spec
    {:name ::orders-stats-delivery-region-dto
     :spec orders-stats-delivery-region-dto-data}))
