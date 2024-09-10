(ns партнерский-api-маркета.specs.category-content-parameters-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.category-parameter-dto :refer :all]
            )
  (:import (java.io File)))


(def category-content-parameters-dto-data
  {
   (ds/req :categoryId) int?
   (ds/opt :parameters) (s/coll-of category-parameter-dto-spec)
   })

(def category-content-parameters-dto-spec
  (ds/spec
    {:name ::category-content-parameters-dto
     :spec category-content-parameters-dto-data}))
