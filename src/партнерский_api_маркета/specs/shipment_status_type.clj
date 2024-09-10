(ns партнерский-api-маркета.specs.shipment-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipment-status-type-data
  {
   })

(def shipment-status-type-spec
  (ds/spec
    {:name ::shipment-status-type
     :spec shipment-status-type-data}))
