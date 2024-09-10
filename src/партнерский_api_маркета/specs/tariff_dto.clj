(ns партнерский-api-маркета.specs.tariff-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.tariff-type :refer :all]
            [партнерский-api-маркета.specs.tariff-parameter-dto :refer :all]
            )
  (:import (java.io File)))


(def tariff-dto-data
  {
   (ds/req :type) tariff-type-spec
   (ds/opt :percent) float?
   (ds/req :amount) float?
   (ds/req :parameters) (s/coll-of tariff-parameter-dto-spec)
   })

(def tariff-dto-spec
  (ds/spec
    {:name ::tariff-dto
     :spec tariff-dto-data}))
