(ns партнерский-api-маркета.specs.outlet-visibility-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def outlet-visibility-type-data
  {
   })

(def outlet-visibility-type-spec
  (ds/spec
    {:name ::outlet-visibility-type
     :spec outlet-visibility-type-data}))
