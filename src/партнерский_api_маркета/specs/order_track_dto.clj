(ns партнерский-api-маркета.specs.order-track-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-track-dto-data
  {
   (ds/opt :trackCode) string?
   (ds/opt :deliveryServiceId) int?
   })

(def order-track-dto-spec
  (ds/spec
    {:name ::order-track-dto
     :spec order-track-dto-data}))
