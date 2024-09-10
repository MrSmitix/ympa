(ns партнерский-api-маркета.specs.sku-bid-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sku-bid-item-dto-data
  {
   (ds/req :sku) string?
   (ds/req :bid) int?
   })

(def sku-bid-item-dto-spec
  (ds/spec
    {:name ::sku-bid-item-dto
     :spec sku-bid-item-dto-data}))
