(ns партнерский-api-маркета.specs.orders-stats-commission-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-stats-commission-type-data
  {
   })

(def orders-stats-commission-type-spec
  (ds/spec
    {:name ::orders-stats-commission-type
     :spec orders-stats-commission-type-data}))
