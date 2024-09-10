(ns партнерский-api-маркета.specs.order-lift-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-lift-type-data
  {
   })

(def order-lift-type-spec
  (ds/spec
    {:name ::order-lift-type
     :spec order-lift-type-data}))
