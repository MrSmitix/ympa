(ns партнерский-api-маркета.specs.age-unit-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def age-unit-type-data
  {
   })

(def age-unit-type-spec
  (ds/spec
    {:name ::age-unit-type
     :spec age-unit-type-data}))
