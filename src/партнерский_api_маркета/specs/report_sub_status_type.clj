(ns партнерский-api-маркета.specs.report-sub-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def report-sub-status-type-data
  {
   })

(def report-sub-status-type-spec
  (ds/spec
    {:name ::report-sub-status-type
     :spec report-sub-status-type-data}))
