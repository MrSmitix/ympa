(ns партнерский-api-маркета.specs.update-order-item-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-item-modification-dto :refer :all]
            [партнерский-api-маркета.specs.order-items-modification-request-reason-type :refer :all]
            )
  (:import (java.io File)))


(def update-order-item-request-data
  {
   (ds/req :items) (s/coll-of order-item-modification-dto-spec)
   (ds/opt :reason) order-items-modification-request-reason-type-spec
   })

(def update-order-item-request-spec
  (ds/spec
    {:name ::update-order-item-request
     :spec update-order-item-request-data}))
