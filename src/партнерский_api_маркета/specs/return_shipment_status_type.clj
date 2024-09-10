(ns партнерский-api-маркета.specs.return-shipment-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-shipment-status-type-data
  {
   })

(def return-shipment-status-type-spec
  (ds/spec
    {:name ::return-shipment-status-type
     :spec return-shipment-status-type-data}))
