(ns партнерский-api-маркета.specs.update-order-status-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-status-change-dto :refer :all]
            )
  (:import (java.io File)))


(def update-order-status-request-data
  {
   (ds/req :order) order-status-change-dto-spec
   })

(def update-order-status-request-spec
  (ds/spec
    {:name ::update-order-status-request
     :spec update-order-status-request-data}))
