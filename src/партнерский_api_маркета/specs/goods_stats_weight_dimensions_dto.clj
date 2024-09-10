(ns партнерский-api-маркета.specs.goods-stats-weight-dimensions-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def goods-stats-weight-dimensions-dto-data
  {
   (ds/opt :length) float?
   (ds/opt :width) float?
   (ds/opt :height) float?
   (ds/opt :weight) float?
   })

(def goods-stats-weight-dimensions-dto-spec
  (ds/spec
    {:name ::goods-stats-weight-dimensions-dto
     :spec goods-stats-weight-dimensions-dto-data}))
