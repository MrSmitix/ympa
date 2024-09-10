(ns партнерский-api-маркета.specs.outlet-delivery-rule-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def outlet-delivery-rule-dto-data
  {
   (ds/opt :minDeliveryDays) int?
   (ds/opt :maxDeliveryDays) int?
   (ds/opt :deliveryServiceId) int?
   (ds/opt :orderBefore) int?
   (ds/opt :priceFreePickup) float?
   (ds/opt :unspecifiedDeliveryInterval) boolean?
   })

(def outlet-delivery-rule-dto-spec
  (ds/spec
    {:name ::outlet-delivery-rule-dto
     :spec outlet-delivery-rule-dto-data}))
