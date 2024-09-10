(ns партнерский-api-маркета.specs.set-order-delivery-date-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-delivery-date-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-date-reason-type :refer :all]
            )
  (:import (java.io File)))


(def set-order-delivery-date-request-data
  {
   (ds/req :dates) order-delivery-date-dto-spec
   (ds/req :reason) order-delivery-date-reason-type-spec
   })

(def set-order-delivery-date-request-spec
  (ds/spec
    {:name ::set-order-delivery-date-request
     :spec set-order-delivery-date-request-data}))
