(ns партнерский-api-маркета.specs.set-shipment-pallets-count-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def set-shipment-pallets-count-request-data
  {
   (ds/req :placesCount) int?
   })

(def set-shipment-pallets-count-request-spec
  (ds/spec
    {:name ::set-shipment-pallets-count-request
     :spec set-shipment-pallets-count-request-data}))
