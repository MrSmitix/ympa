(ns партнерский-api-маркета.specs.business-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   })

(def business-dto-spec
  (ds/spec
    {:name ::business-dto
     :spec business-dto-data}))
