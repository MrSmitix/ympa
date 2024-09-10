(ns партнерский-api-маркета.specs.goods-feedback-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.goods-feedback-identifiers-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-description-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-media-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-statistics-dto :refer :all]
            )
  (:import (java.io File)))


(def goods-feedback-dto-data
  {
   (ds/req :feedbackId) int?
   (ds/req :createdAt) inst?
   (ds/req :needReaction) boolean?
   (ds/req :identifiers) goods-feedback-identifiers-dto-spec
   (ds/opt :author) string?
   (ds/opt :description) goods-feedback-description-dto-spec
   (ds/opt :media) goods-feedback-media-dto-spec
   (ds/req :statistics) goods-feedback-statistics-dto-spec
   })

(def goods-feedback-dto-spec
  (ds/spec
    {:name ::goods-feedback-dto
     :spec goods-feedback-dto-data}))
