(ns партнерский-api-маркета.specs.update-stock-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-stock-item-dto-data
  {
   (ds/req :count) int?
   (ds/opt :updatedAt) inst?
   })

(def update-stock-item-dto-spec
  (ds/spec
    {:name ::update-stock-item-dto
     :spec update-stock-item-dto-data}))
