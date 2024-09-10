(ns партнерский-api-маркета.specs.eac-verification-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def eac-verification-status-type-data
  {
   })

(def eac-verification-status-type-spec
  (ds/spec
    {:name ::eac-verification-status-type
     :spec eac-verification-status-type-data}))
