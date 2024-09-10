(ns партнерский-api-маркета.specs.license-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def license-type-data
  {
   })

(def license-type-spec
  (ds/spec
    {:name ::license-type
     :spec license-type-data}))
