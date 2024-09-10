(ns партнерский-api-маркета.specs.brief-order-item-instance-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def brief-order-item-instance-dto-data
  {
   (ds/opt :cis) string?
   (ds/opt :uin) string?
   (ds/opt :rnpt) string?
   (ds/opt :gtd) string?
   })

(def brief-order-item-instance-dto-spec
  (ds/spec
    {:name ::brief-order-item-instance-dto
     :spec brief-order-item-instance-dto-data}))
