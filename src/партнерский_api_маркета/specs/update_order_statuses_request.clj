(ns партнерский-api-маркета.specs.update-order-statuses-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-state-dto :refer :all]
            )
  (:import (java.io File)))


(def update-order-statuses-request-data
  {
   (ds/req :orders) (s/coll-of order-state-dto-spec)
   })

(def update-order-statuses-request-spec
  (ds/spec
    {:name ::update-order-statuses-request
     :spec update-order-statuses-request-data}))
