(ns партнерский-api-маркета.specs.get-order-labels-data-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.order-label-dto :refer :all]
            )
  (:import (java.io File)))


(def get-order-labels-data-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) order-label-dto-spec
   })

(def get-order-labels-data-response-spec
  (ds/spec
    {:name ::get-order-labels-data-response
     :spec get-order-labels-data-response-data}))
