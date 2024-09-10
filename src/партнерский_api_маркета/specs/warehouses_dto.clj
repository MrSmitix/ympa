(ns партнерский-api-маркета.specs.warehouses-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-group-dto :refer :all]
            )
  (:import (java.io File)))


(def warehouses-dto-data
  {
   (ds/req :warehouses) (s/coll-of warehouse-dto-spec)
   (ds/req :warehouseGroups) (s/coll-of warehouse-group-dto-spec)
   })

(def warehouses-dto-spec
  (ds/spec
    {:name ::warehouses-dto
     :spec warehouses-dto-data}))
