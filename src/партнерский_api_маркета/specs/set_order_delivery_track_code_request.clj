(ns партнерский-api-маркета.specs.set-order-delivery-track-code-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def set-order-delivery-track-code-request-data
  {
   (ds/req :trackCode) string?
   (ds/req :deliveryServiceId) int?
   })

(def set-order-delivery-track-code-request-spec
  (ds/spec
    {:name ::set-order-delivery-track-code-request
     :spec set-order-delivery-track-code-request-data}))
