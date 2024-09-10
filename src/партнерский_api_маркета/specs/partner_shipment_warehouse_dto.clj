(ns партнерский-api-маркета.specs.partner-shipment-warehouse-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def partner-shipment-warehouse-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :address) string?
   })

(def partner-shipment-warehouse-dto-spec
  (ds/spec
    {:name ::partner-shipment-warehouse-dto
     :spec partner-shipment-warehouse-dto-data}))
