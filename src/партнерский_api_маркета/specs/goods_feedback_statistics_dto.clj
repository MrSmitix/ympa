(ns партнерский-api-маркета.specs.goods-feedback-statistics-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def goods-feedback-statistics-dto-data
  {
   (ds/req :rating) int?
   (ds/req :commentsCount) int?
   (ds/opt :recommended) boolean?
   (ds/opt :paidAmount) int?
   })

(def goods-feedback-statistics-dto-spec
  (ds/spec
    {:name ::goods-feedback-statistics-dto
     :spec goods-feedback-statistics-dto-data}))
