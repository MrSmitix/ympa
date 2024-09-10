(ns партнерский-api-маркета.specs.order-item-instance-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-item-instance-dto-data
  {
   (ds/opt :cis) string?
   (ds/opt :cisFull) string?
   (ds/opt :uin) string?
   (ds/opt :rnpt) string?
   (ds/opt :gtd) string?
   })

(def order-item-instance-dto-spec
  (ds/spec
    {:name ::order-item-instance-dto
     :spec order-item-instance-dto-data}))
