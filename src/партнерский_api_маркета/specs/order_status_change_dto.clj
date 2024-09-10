(ns партнерский-api-маркета.specs.order-status-change-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-status-type :refer :all]
            [партнерский-api-маркета.specs.order-substatus-type :refer :all]
            [партнерский-api-маркета.specs.order-status-change-delivery-dto :refer :all]
            )
  (:import (java.io File)))


(def order-status-change-dto-data
  {
   (ds/req :status) order-status-type-spec
   (ds/opt :substatus) order-substatus-type-spec
   (ds/opt :delivery) order-status-change-delivery-dto-spec
   })

(def order-status-change-dto-spec
  (ds/spec
    {:name ::order-status-change-dto
     :spec order-status-change-dto-data}))
