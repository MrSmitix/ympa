(ns партнерский-api-маркета.specs.order-item-detail-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-item-status-type :refer :all]
            )
  (:import (java.io File)))


(def order-item-detail-dto-data
  {
   (ds/opt :itemCount) int?
   (ds/opt :itemStatus) order-item-status-type-spec
   (ds/opt :updateDate) string?
   })

(def order-item-detail-dto-spec
  (ds/spec
    {:name ::order-item-detail-dto
     :spec order-item-detail-dto-data}))
