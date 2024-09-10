(ns партнерский-api-маркета.specs.parameter-value-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def parameter-value-dto-data
  {
   (ds/req :parameterId) int?
   (ds/opt :unitId) int?
   (ds/opt :valueId) int?
   (ds/opt :value) string?
   })

(def parameter-value-dto-spec
  (ds/spec
    {:name ::parameter-value-dto
     :spec parameter-value-dto-data}))
