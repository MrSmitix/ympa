(ns партнерский-api-маркета.specs.set-order-box-layout-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-box-layout-dto :refer :all]
            )
  (:import (java.io File)))


(def set-order-box-layout-request-data
  {
   (ds/req :boxes) (s/coll-of order-box-layout-dto-spec)
   (ds/opt :allowRemove) boolean?
   })

(def set-order-box-layout-request-spec
  (ds/spec
    {:name ::set-order-box-layout-request
     :spec set-order-box-layout-request-data}))
