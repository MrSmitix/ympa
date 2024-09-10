(ns партнерский-api-маркета.specs.order-items-modification-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.brief-order-item-dto :refer :all]
            )
  (:import (java.io File)))


(def order-items-modification-result-dto-data
  {
   (ds/req :items) (s/coll-of brief-order-item-dto-spec)
   })

(def order-items-modification-result-dto-spec
  (ds/spec
    {:name ::order-items-modification-result-dto
     :spec order-items-modification-result-dto-data}))
