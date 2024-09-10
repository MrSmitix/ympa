(ns партнерский-api-маркета.specs.quantum-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quantum-dto-data
  {
   (ds/opt :minQuantity) int?
   (ds/opt :stepQuantity) int?
   })

(def quantum-dto-spec
  (ds/spec
    {:name ::quantum-dto
     :spec quantum-dto-data}))
