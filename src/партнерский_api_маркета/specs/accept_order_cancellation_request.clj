(ns партнерский-api-маркета.specs.accept-order-cancellation-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-cancellation-reason-type :refer :all]
            )
  (:import (java.io File)))


(def accept-order-cancellation-request-data
  {
   (ds/req :accepted) boolean?
   (ds/opt :reason) order-cancellation-reason-type-spec
   })

(def accept-order-cancellation-request-spec
  (ds/spec
    {:name ::accept-order-cancellation-request
     :spec accept-order-cancellation-request-data}))
