(ns партнерский-api-маркета.specs.quality-rating-component-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quality-rating-component-type-data
  {
   })

(def quality-rating-component-type-spec
  (ds/spec
    {:name ::quality-rating-component-type
     :spec quality-rating-component-type-data}))
