(ns партнерский-api-маркета.specs.extension-shipment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shipment-status-change-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-action-type :refer :all]
            )
  (:import (java.io File)))


(def extension-shipment-dto-data
  {
   (ds/opt :currentStatus) shipment-status-change-dto-spec
   (ds/req :availableActions) (s/coll-of shipment-action-type-spec)
   })

(def extension-shipment-dto-spec
  (ds/spec
    {:name ::extension-shipment-dto
     :spec extension-shipment-dto-data}))
