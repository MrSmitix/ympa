(ns партнерский-api-маркета.specs.mechanics-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def mechanics-type-data
  {
   })

(def mechanics-type-spec
  (ds/spec
    {:name ::mechanics-type
     :spec mechanics-type-data}))
