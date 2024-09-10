(ns партнерский-api-маркета.specs.outlet-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def outlet-type-data
  {
   })

(def outlet-type-spec
  (ds/spec
    {:name ::outlet-type
     :spec outlet-type-data}))
