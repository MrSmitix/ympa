(ns партнерский-api-маркета.specs.shipment-boxes-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.parcel-box-dto :refer :all]
            )
  (:import (java.io File)))


(def shipment-boxes-dto-data
  {
   (ds/req :boxes) (s/coll-of parcel-box-dto-spec)
   })

(def shipment-boxes-dto-spec
  (ds/spec
    {:name ::shipment-boxes-dto
     :spec shipment-boxes-dto-data}))
