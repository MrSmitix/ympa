(ns партнерский-api-маркета.specs.age-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.age-unit-type :refer :all]
            )
  (:import (java.io File)))


(def age-dto-data
  {
   (ds/req :value) float?
   (ds/req :ageUnit) age-unit-type-spec
   })

(def age-dto-spec
  (ds/spec
    {:name ::age-dto
     :spec age-dto-data}))
