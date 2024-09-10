(ns партнерский-api-маркета.specs.fulfillment-warehouses-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.fulfillment-warehouse-dto :refer :all]
            )
  (:import (java.io File)))


(def fulfillment-warehouses-dto-data
  {
   (ds/req :warehouses) (s/coll-of fulfillment-warehouse-dto-spec)
   })

(def fulfillment-warehouses-dto-spec
  (ds/spec
    {:name ::fulfillment-warehouses-dto
     :spec fulfillment-warehouses-dto-data}))
