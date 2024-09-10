(ns партнерский-api-маркета.specs.parcel-box-label-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def parcel-box-label-dto-data
  {
   (ds/req :url) string?
   (ds/req :supplierName) string?
   (ds/req :deliveryServiceName) string?
   (ds/req :orderId) int?
   (ds/req :orderNum) string?
   (ds/req :recipientName) string?
   (ds/req :boxId) int?
   (ds/req :fulfilmentId) string?
   (ds/req :place) string?
   (ds/req :weight) string?
   (ds/req :deliveryServiceId) string?
   (ds/opt :deliveryAddress) string?
   (ds/opt :shipmentDate) string?
   })

(def parcel-box-label-dto-spec
  (ds/spec
    {:name ::parcel-box-label-dto
     :spec parcel-box-label-dto-data}))
