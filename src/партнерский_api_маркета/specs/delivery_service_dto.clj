(ns партнерский-api-маркета.specs.delivery-service-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-service-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   })

(def delivery-service-dto-spec
  (ds/spec
    {:name ::delivery-service-dto
     :spec delivery-service-dto-data}))
