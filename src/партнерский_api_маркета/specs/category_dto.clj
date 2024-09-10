(ns партнерский-api-маркета.specs.category-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.category-dto :refer :all]
            )
  (:import (java.io File)))


(def category-dto-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :children) (s/coll-of category-dto-spec)
   })

(def category-dto-spec
  (ds/spec
    {:name ::category-dto
     :spec category-dto-data}))
