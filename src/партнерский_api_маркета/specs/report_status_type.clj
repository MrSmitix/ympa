(ns партнерский-api-маркета.specs.report-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def report-status-type-data
  {
   })

(def report-status-type-spec
  (ds/spec
    {:name ::report-status-type
     :spec report-status-type-data}))
