(ns партнерский-api-маркета.specs.update-stock-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-stock-item-dto :refer :all]
            )
  (:import (java.io File)))


(def update-stock-dto-data
  {
   (ds/req :sku) string?
   (ds/req :items) (s/coll-of update-stock-item-dto-spec)
   })

(def update-stock-dto-spec
  (ds/spec
    {:name ::update-stock-dto
     :spec update-stock-dto-data}))
