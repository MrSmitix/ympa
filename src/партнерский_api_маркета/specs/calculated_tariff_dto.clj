(ns партнерский-api-маркета.specs.calculated-tariff-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.calculated-tariff-type :refer :all]
            [партнерский-api-маркета.specs.tariff-parameter-dto :refer :all]
            )
  (:import (java.io File)))


(def calculated-tariff-dto-data
  {
   (ds/req :type) calculated-tariff-type-spec
   (ds/opt :amount) float?
   (ds/req :parameters) (s/coll-of tariff-parameter-dto-spec)
   })

(def calculated-tariff-dto-spec
  (ds/spec
    {:name ::calculated-tariff-dto
     :spec calculated-tariff-dto-data}))
