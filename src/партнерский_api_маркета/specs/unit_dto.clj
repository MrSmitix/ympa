(ns партнерский-api-маркета.specs.unit-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def unit-dto-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :fullName) string?
   })

(def unit-dto-spec
  (ds/spec
    {:name ::unit-dto
     :spec unit-dto-data}))
