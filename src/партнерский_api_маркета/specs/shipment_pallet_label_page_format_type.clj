(ns партнерский-api-маркета.specs.shipment-pallet-label-page-format-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipment-pallet-label-page-format-type-data
  {
   })

(def shipment-pallet-label-page-format-type-spec
  (ds/spec
    {:name ::shipment-pallet-label-page-format-type
     :spec shipment-pallet-label-page-format-type-data}))
