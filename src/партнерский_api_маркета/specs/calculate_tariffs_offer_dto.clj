(ns партнерский-api-маркета.specs.calculate-tariffs-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def calculate-tariffs-offer-dto-data
  {
   (ds/req :categoryId) int?
   (ds/req :price) float?
   (ds/req :length) float?
   (ds/req :width) float?
   (ds/req :height) float?
   (ds/req :weight) float?
   (ds/opt :quantity) int?
   })

(def calculate-tariffs-offer-dto-spec
  (ds/spec
    {:name ::calculate-tariffs-offer-dto
     :spec calculate-tariffs-offer-dto-data}))
