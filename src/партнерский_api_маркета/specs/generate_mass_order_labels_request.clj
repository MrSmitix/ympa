(ns партнерский-api-маркета.specs.generate-mass-order-labels-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-mass-order-labels-request-data
  {
   (ds/req :businessId) int?
   (ds/req :orderIds) (s/coll-of int?)
   })

(def generate-mass-order-labels-request-spec
  (ds/spec
    {:name ::generate-mass-order-labels-request
     :spec generate-mass-order-labels-request-data}))
