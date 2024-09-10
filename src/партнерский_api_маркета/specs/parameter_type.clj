(ns партнерский-api-маркета.specs.parameter-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def parameter-type-data
  {
   })

(def parameter-type-spec
  (ds/spec
    {:name ::parameter-type
     :spec parameter-type-data}))
