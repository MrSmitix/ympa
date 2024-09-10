(ns партнерский-api-маркета.specs.order-delivery-date-reason-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-delivery-date-reason-type-data
  {
   })

(def order-delivery-date-reason-type-spec
  (ds/spec
    {:name ::order-delivery-date-reason-type
     :spec order-delivery-date-reason-type-data}))
