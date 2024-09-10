(ns партнерский-api-маркета.specs.get-warehouses-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.warehouses-dto :refer :all]
            )
  (:import (java.io File)))


(def get-warehouses-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) warehouses-dto-spec
   })

(def get-warehouses-response-spec
  (ds/spec
    {:name ::get-warehouses-response
     :spec get-warehouses-response-data}))
