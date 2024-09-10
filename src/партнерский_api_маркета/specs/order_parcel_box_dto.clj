(ns партнерский-api-маркета.specs.order-parcel-box-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-parcel-box-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :fulfilmentId) string?
   })

(def order-parcel-box-dto-spec
  (ds/spec
    {:name ::order-parcel-box-dto
     :spec order-parcel-box-dto-data}))
