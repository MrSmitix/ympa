(ns партнерский-api-маркета.specs.update-order-statuses-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.update-order-statuses-dto :refer :all]
            )
  (:import (java.io File)))


(def update-order-statuses-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) update-order-statuses-dto-spec
   })

(def update-order-statuses-response-spec
  (ds/spec
    {:name ::update-order-statuses-response
     :spec update-order-statuses-response-data}))
