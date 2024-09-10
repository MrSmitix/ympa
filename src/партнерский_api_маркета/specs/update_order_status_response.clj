(ns партнерский-api-маркета.specs.update-order-status-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-dto :refer :all]
            )
  (:import (java.io File)))


(def update-order-status-response-data
  {
   (ds/opt :order) order-dto-spec
   })

(def update-order-status-response-spec
  (ds/spec
    {:name ::update-order-status-response
     :spec update-order-status-response-data}))
