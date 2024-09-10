(ns партнерский-api-маркета.specs.option-values-limited-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def option-values-limited-dto-data
  {
   (ds/req :limitingOptionValueId) int?
   (ds/req :optionValueIds) (s/coll-of int?)
   })

(def option-values-limited-dto-spec
  (ds/spec
    {:name ::option-values-limited-dto
     :spec option-values-limited-dto-data}))
