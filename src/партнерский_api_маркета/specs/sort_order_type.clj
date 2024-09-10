(ns партнерский-api-маркета.specs.sort-order-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sort-order-type-data
  {
   })

(def sort-order-type-spec
  (ds/spec
    {:name ::sort-order-type
     :spec sort-order-type-data}))
