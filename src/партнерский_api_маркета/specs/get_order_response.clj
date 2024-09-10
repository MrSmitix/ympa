(ns партнерский-api-маркета.specs.get-order-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-dto :refer :all]
            )
  (:import (java.io File)))


(def get-order-response-data
  {
   (ds/opt :order) order-dto-spec
   })

(def get-order-response-spec
  (ds/spec
    {:name ::get-order-response
     :spec get-order-response-data}))
