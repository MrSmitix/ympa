(ns партнерский-api-маркета.specs.order-delivery-dates-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-delivery-dates-dto-data
  {
   (ds/opt :fromDate) string?
   (ds/opt :toDate) string?
   (ds/opt :fromTime) string?
   (ds/opt :toTime) string?
   (ds/opt :realDeliveryDate) string?
   })

(def order-delivery-dates-dto-spec
  (ds/spec
    {:name ::order-delivery-dates-dto
     :spec order-delivery-dates-dto-data}))
