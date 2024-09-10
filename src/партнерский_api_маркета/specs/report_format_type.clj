(ns партнерский-api-маркета.specs.report-format-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def report-format-type-data
  {
   })

(def report-format-type-spec
  (ds/spec
    {:name ::report-format-type
     :spec report-format-type-data}))
