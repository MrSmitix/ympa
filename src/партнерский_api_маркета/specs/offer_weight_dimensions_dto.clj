(ns партнерский-api-маркета.specs.offer-weight-dimensions-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-weight-dimensions-dto-data
  {
   (ds/req :length) float?
   (ds/req :width) float?
   (ds/req :height) float?
   (ds/req :weight) float?
   })

(def offer-weight-dimensions-dto-spec
  (ds/spec
    {:name ::offer-weight-dimensions-dto
     :spec offer-weight-dimensions-dto-data}))
