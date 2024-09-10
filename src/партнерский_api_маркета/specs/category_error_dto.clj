(ns партнерский-api-маркета.specs.category-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.category-error-type :refer :all]
            )
  (:import (java.io File)))


(def category-error-dto-data
  {
   (ds/opt :categoryId) int?
   (ds/opt :type) category-error-type-spec
   })

(def category-error-dto-spec
  (ds/spec
    {:name ::category-error-dto
     :spec category-error-dto-data}))
