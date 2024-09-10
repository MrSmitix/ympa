(ns партнерский-api-маркета.specs.category-parameter-unit-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.unit-dto :refer :all]
            )
  (:import (java.io File)))


(def category-parameter-unit-dto-data
  {
   (ds/req :defaultUnitId) int?
   (ds/req :units) (s/coll-of unit-dto-spec)
   })

(def category-parameter-unit-dto-spec
  (ds/spec
    {:name ::category-parameter-unit-dto
     :spec category-parameter-unit-dto-data}))
