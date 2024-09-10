(ns партнерский-api-маркета.specs.calculated-tariff-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def calculated-tariff-type-data
  {
   })

(def calculated-tariff-type-spec
  (ds/spec
    {:name ::calculated-tariff-type
     :spec calculated-tariff-type-data}))
