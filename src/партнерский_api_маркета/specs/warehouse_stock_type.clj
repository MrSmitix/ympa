(ns партнерский-api-маркета.specs.warehouse-stock-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def warehouse-stock-type-data
  {
   })

(def warehouse-stock-type-spec
  (ds/spec
    {:name ::warehouse-stock-type
     :spec warehouse-stock-type-data}))
