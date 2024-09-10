(ns партнерский-api-маркета.specs.update-order-status-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-status-type :refer :all]
            [партнерский-api-маркета.specs.order-substatus-type :refer :all]
            [партнерский-api-маркета.specs.order-update-status-type :refer :all]
            )
  (:import (java.io File)))


(def update-order-status-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :status) order-status-type-spec
   (ds/opt :substatus) order-substatus-type-spec
   (ds/opt :updateStatus) order-update-status-type-spec
   (ds/opt :errorDetails) string?
   })

(def update-order-status-dto-spec
  (ds/spec
    {:name ::update-order-status-dto
     :spec update-order-status-dto-data}))
