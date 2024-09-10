(ns партнерский-api-маркета.specs.tariff-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tariff-type-data
  {
   })

(def tariff-type-spec
  (ds/spec
    {:name ::tariff-type
     :spec tariff-type-data}))
