(ns партнерский-api-маркета.specs.field-state-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def field-state-type-data
  {
   })

(def field-state-type-spec
  (ds/spec
    {:name ::field-state-type
     :spec field-state-type-data}))
