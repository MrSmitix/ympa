(ns партнерский-api-маркета.specs.category-error-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def category-error-type-data
  {
   })

(def category-error-type-spec
  (ds/spec
    {:name ::category-error-type
     :spec category-error-type-data}))
