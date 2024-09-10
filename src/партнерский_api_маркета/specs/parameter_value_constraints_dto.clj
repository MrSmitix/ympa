(ns партнерский-api-маркета.specs.parameter-value-constraints-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def parameter-value-constraints-dto-data
  {
   (ds/opt :minValue) float?
   (ds/opt :maxValue) float?
   (ds/opt :maxLength) int?
   })

(def parameter-value-constraints-dto-spec
  (ds/spec
    {:name ::parameter-value-constraints-dto
     :spec parameter-value-constraints-dto-data}))
