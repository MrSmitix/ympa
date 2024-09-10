(ns партнерский-api-маркета.specs.orders-stats-price-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-price-type-data
  {
   })

(def orders-stats-price-type-spec
  (ds/spec
    {:name ::orders-stats-price-type
     :spec orders-stats-price-type-data}))
