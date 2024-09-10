(ns партнерский-api-маркета.specs.goods-feedback-comment-author-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.goods-feedback-comment-author-type :refer :all]
            )
  (:import (java.io File)))


(def goods-feedback-comment-author-dto-data
  {
   (ds/opt :type) goods-feedback-comment-author-type-spec
   (ds/opt :name) string?
   })

(def goods-feedback-comment-author-dto-spec
  (ds/spec
    {:name ::goods-feedback-comment-author-dto
     :spec goods-feedback-comment-author-dto-data}))
