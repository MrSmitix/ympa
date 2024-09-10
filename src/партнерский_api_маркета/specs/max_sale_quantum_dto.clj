(ns партнерский-api-маркета.specs.max-sale-quantum-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def max-sale-quantum-dto-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   (ds/opt :maxSaleQuantum) int?
   })

(def max-sale-quantum-dto-spec
  (ds/spec
    {:name ::max-sale-quantum-dto
     :spec max-sale-quantum-dto-data}))
