(ns партнерский-api-маркета.specs.selling-program-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def selling-program-type-data
  {
   })

(def selling-program-type-spec
  (ds/spec
    {:name ::selling-program-type
     :spec selling-program-type-data}))
