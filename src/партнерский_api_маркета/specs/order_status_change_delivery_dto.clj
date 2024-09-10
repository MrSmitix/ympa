(ns партнерский-api-маркета.specs.order-status-change-delivery-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-status-change-delivery-dates-dto :refer :all]
            )
  (:import (java.io File)))


(def order-status-change-delivery-dto-data
  {
   (ds/opt :dates) order-status-change-delivery-dates-dto-spec
   })

(def order-status-change-delivery-dto-spec
  (ds/spec
    {:name ::order-status-change-delivery-dto
     :spec order-status-change-delivery-dto-data}))
