(ns партнерский-api-маркета.specs.parameter-value-option-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def parameter-value-option-dto-data
  {
   (ds/req :id) int?
   (ds/req :value) string?
   (ds/opt :description) string?
   })

(def parameter-value-option-dto-spec
  (ds/spec
    {:name ::parameter-value-option-dto
     :spec parameter-value-option-dto-data}))
