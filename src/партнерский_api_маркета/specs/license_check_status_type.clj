(ns партнерский-api-маркета.specs.license-check-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def license-check-status-type-data
  {
   })

(def license-check-status-type-spec
  (ds/spec
    {:name ::license-check-status-type
     :spec license-check-status-type-data}))
