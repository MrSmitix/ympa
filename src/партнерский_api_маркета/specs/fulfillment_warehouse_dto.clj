(ns партнерский-api-маркета.specs.fulfillment-warehouse-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.warehouse-address-dto :refer :all]
            )
  (:import (java.io File)))


(def fulfillment-warehouse-dto-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :address) warehouse-address-dto-spec
   })

(def fulfillment-warehouse-dto-spec
  (ds/spec
    {:name ::fulfillment-warehouse-dto
     :spec fulfillment-warehouse-dto-data}))
