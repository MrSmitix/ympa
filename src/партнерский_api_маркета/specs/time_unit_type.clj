(ns партнерский-api-маркета.specs.time-unit-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def time-unit-type-data
  {
   })

(def time-unit-type-spec
  (ds/spec
    {:name ::time-unit-type
     :spec time-unit-type-data}))
