(ns партнерский-api-маркета.specs.currency-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def currency-type-data
  {
   })

(def currency-type-spec
  (ds/spec
    {:name ::currency-type
     :spec currency-type-data}))
