(ns партнерский-api-маркета.specs.value-restriction-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.option-values-limited-dto :refer :all]
            )
  (:import (java.io File)))


(def value-restriction-dto-data
  {
   (ds/req :limitingParameterId) int?
   (ds/req :limitedValues) (s/coll-of option-values-limited-dto-spec)
   })

(def value-restriction-dto-spec
  (ds/spec
    {:name ::value-restriction-dto
     :spec value-restriction-dto-data}))
