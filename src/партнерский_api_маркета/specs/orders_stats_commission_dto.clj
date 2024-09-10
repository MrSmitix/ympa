(ns партнерский-api-маркета.specs.orders-stats-commission-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.orders-stats-commission-type :refer :all]
            )
  (:import (java.io File)))


(def orders-stats-commission-dto-data
  {
   (ds/opt :type) orders-stats-commission-type-spec
   (ds/opt :actual) float?
   })

(def orders-stats-commission-dto-spec
  (ds/spec
    {:name ::orders-stats-commission-dto
     :spec orders-stats-commission-dto-data}))
