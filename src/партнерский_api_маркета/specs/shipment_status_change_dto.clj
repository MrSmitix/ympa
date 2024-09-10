(ns партнерский-api-маркета.specs.shipment-status-change-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shipment-status-type :refer :all]
            )
  (:import (java.io File)))


(def shipment-status-change-dto-data
  {
   (ds/opt :status) shipment-status-type-spec
   (ds/opt :description) string?
   (ds/opt :updateTime) inst?
   })

(def shipment-status-change-dto-spec
  (ds/spec
    {:name ::shipment-status-change-dto
     :spec shipment-status-change-dto-data}))
