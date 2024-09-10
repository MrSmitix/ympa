(ns партнерский-api-маркета.specs.warehouse-stock-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.warehouse-stock-type :refer :all]
            )
  (:import (java.io File)))


(def warehouse-stock-dto-data
  {
   (ds/req :type) warehouse-stock-type-spec
   (ds/req :count) int?
   })

(def warehouse-stock-dto-spec
  (ds/spec
    {:name ::warehouse-stock-dto
     :spec warehouse-stock-dto-data}))
