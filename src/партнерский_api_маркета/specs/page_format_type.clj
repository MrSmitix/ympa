(ns партнерский-api-маркета.specs.page-format-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def page-format-type-data
  {
   })

(def page-format-type-spec
  (ds/spec
    {:name ::page-format-type
     :spec page-format-type-data}))
