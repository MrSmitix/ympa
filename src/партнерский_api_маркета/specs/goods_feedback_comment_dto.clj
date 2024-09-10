(ns партнерский-api-маркета.specs.goods-feedback-comment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.goods-feedback-comment-author-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-status-type :refer :all]
            )
  (:import (java.io File)))


(def goods-feedback-comment-dto-data
  {
   (ds/req :id) int?
   (ds/req :text) string?
   (ds/opt :canModify) boolean?
   (ds/opt :parentId) int?
   (ds/req :author) goods-feedback-comment-author-dto-spec
   (ds/req :status) goods-feedback-comment-status-type-spec
   })

(def goods-feedback-comment-dto-spec
  (ds/spec
    {:name ::goods-feedback-comment-dto
     :spec goods-feedback-comment-dto-data}))
