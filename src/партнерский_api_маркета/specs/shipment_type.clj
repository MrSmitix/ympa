(ns партнерский-api-маркета.specs.shipment-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipment-type-data
  {
   })

(def shipment-type-spec
  (ds/spec
    {:name ::shipment-type
     :spec shipment-type-data}))
