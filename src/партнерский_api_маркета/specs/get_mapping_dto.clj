(ns партнерский-api-маркета.specs.get-mapping-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-mapping-dto-data
  {
   (ds/opt :marketSku) int?
   (ds/opt :marketSkuName) string?
   (ds/opt :marketModelId) int?
   (ds/opt :marketModelName) string?
   (ds/opt :marketCategoryId) int?
   (ds/opt :marketCategoryName) string?
   })

(def get-mapping-dto-spec
  (ds/spec
    {:name ::get-mapping-dto
     :spec get-mapping-dto-data}))
