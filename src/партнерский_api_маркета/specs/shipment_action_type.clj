(ns партнерский-api-маркета.specs.shipment-action-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipment-action-type-data
  {
   })

(def shipment-action-type-spec
  (ds/spec
    {:name ::shipment-action-type
     :spec shipment-action-type-data}))
