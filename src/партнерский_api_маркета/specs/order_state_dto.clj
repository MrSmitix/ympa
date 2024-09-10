(ns партнерский-api-маркета.specs.order-state-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-status-type :refer :all]
            [партнерский-api-маркета.specs.order-substatus-type :refer :all]
            )
  (:import (java.io File)))


(def order-state-dto-data
  {
   (ds/req :id) int?
   (ds/req :status) order-status-type-spec
   (ds/opt :substatus) order-substatus-type-spec
   })

(def order-state-dto-spec
  (ds/spec
    {:name ::order-state-dto
     :spec order-state-dto-data}))
