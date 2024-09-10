(ns партнерский-api-маркета.specs.order-courier-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-courier-dto-data
  {
   (ds/opt :fullName) string?
   (ds/opt :phone) string?
   (ds/opt :phoneExtension) string?
   (ds/opt :vehicleNumber) string?
   (ds/opt :vehicleDescription) string?
   })

(def order-courier-dto-spec
  (ds/spec
    {:name ::order-courier-dto
     :spec order-courier-dto-data}))
