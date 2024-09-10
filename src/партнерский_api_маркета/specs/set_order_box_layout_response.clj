(ns партнерский-api-маркета.specs.set-order-box-layout-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.order-boxes-layout-dto :refer :all]
            )
  (:import (java.io File)))


(def set-order-box-layout-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) order-boxes-layout-dto-spec
   })

(def set-order-box-layout-response-spec
  (ds/spec
    {:name ::set-order-box-layout-response
     :spec set-order-box-layout-response-data}))
