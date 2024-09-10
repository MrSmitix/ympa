(ns партнерский-api-маркета.specs.update-order-statuses-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-order-status-dto :refer :all]
            )
  (:import (java.io File)))


(def update-order-statuses-dto-data
  {
   (ds/req :orders) (s/coll-of update-order-status-dto-spec)
   })

(def update-order-statuses-dto-spec
  (ds/spec
    {:name ::update-order-statuses-dto
     :spec update-order-statuses-dto-data}))
