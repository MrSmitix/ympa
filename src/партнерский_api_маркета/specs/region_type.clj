(ns партнерский-api-маркета.specs.region-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def region-type-data
  {
   })

(def region-type-spec
  (ds/spec
    {:name ::region-type
     :spec region-type-data}))
