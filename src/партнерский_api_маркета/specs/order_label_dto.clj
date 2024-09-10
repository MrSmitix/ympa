(ns партнерский-api-маркета.specs.order-label-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.parcel-box-label-dto :refer :all]
            )
  (:import (java.io File)))


(def order-label-dto-data
  {
   (ds/req :orderId) int?
   (ds/req :placesNumber) int?
   (ds/req :url) string?
   (ds/req :parcelBoxLabels) (s/coll-of parcel-box-label-dto-spec)
   })

(def order-label-dto-spec
  (ds/spec
    {:name ::order-label-dto
     :spec order-label-dto-data}))
