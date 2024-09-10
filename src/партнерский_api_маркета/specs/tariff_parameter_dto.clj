(ns партнерский-api-маркета.specs.tariff-parameter-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tariff-parameter-dto-data
  {
   (ds/req :name) string?
   (ds/req :value) string?
   })

(def tariff-parameter-dto-spec
  (ds/spec
    {:name ::tariff-parameter-dto
     :spec tariff-parameter-dto-data}))
