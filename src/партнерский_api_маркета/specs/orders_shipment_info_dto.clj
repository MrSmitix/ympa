(ns партнерский-api-маркета.specs.orders-shipment-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def orders-shipment-info-dto-data
  {
   (ds/req :orderIdsWithLabels) (s/coll-of int?)
   (ds/req :orderIdsWithoutLabels) (s/coll-of int?)
   })

(def orders-shipment-info-dto-spec
  (ds/spec
    {:name ::orders-shipment-info-dto
     :spec orders-shipment-info-dto-data}))
