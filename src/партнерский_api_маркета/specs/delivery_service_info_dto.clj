(ns партнерский-api-маркета.specs.delivery-service-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-service-info-dto-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   })

(def delivery-service-info-dto-spec
  (ds/spec
    {:name ::delivery-service-info-dto
     :spec delivery-service-info-dto-data}))
