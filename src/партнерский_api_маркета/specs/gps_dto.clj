(ns партнерский-api-маркета.specs.gps-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gps-dto-data
  {
   (ds/req :latitude) float?
   (ds/req :longitude) float?
   })

(def gps-dto-spec
  (ds/spec
    {:name ::gps-dto
     :spec gps-dto-data}))
