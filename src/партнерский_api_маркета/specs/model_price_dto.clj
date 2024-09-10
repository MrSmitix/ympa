(ns партнерский-api-маркета.specs.model-price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def model-price-dto-data
  {
   (ds/opt :avg) float?
   (ds/opt :max) float?
   (ds/opt :min) float?
   })

(def model-price-dto-spec
  (ds/spec
    {:name ::model-price-dto
     :spec model-price-dto-data}))
