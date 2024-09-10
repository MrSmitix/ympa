(ns партнерский-api-маркета.specs.logistic-point-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def logistic-point-type-data
  {
   })

(def logistic-point-type-spec
  (ds/spec
    {:name ::logistic-point-type
     :spec logistic-point-type-data}))
