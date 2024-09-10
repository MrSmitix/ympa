(ns партнерский-api-маркета.specs.warehouse-group-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-dto :refer :all]
            )
  (:import (java.io File)))


(def warehouse-group-dto-data
  {
   (ds/req :name) string?
   (ds/req :mainWarehouse) warehouse-dto-spec
   (ds/req :warehouses) (s/coll-of warehouse-dto-spec)
   })

(def warehouse-group-dto-spec
  (ds/spec
    {:name ::warehouse-group-dto
     :spec warehouse-group-dto-data}))
