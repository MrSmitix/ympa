(ns партнерский-api-маркета.specs.order-status-change-delivery-dates-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-status-change-delivery-dates-dto-data
  {
   (ds/opt :realDeliveryDate) inst?
   })

(def order-status-change-delivery-dates-dto-spec
  (ds/spec
    {:name ::order-status-change-delivery-dates-dto
     :spec order-status-change-delivery-dates-dto-data}))
