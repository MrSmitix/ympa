(ns партнерский-api-маркета.specs.outlet-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def outlet-status-type-data
  {
   })

(def outlet-status-type-spec
  (ds/spec
    {:name ::outlet-status-type
     :spec outlet-status-type-data}))
