(ns партнерский-api-маркета.specs.goods-feedback-comment-list-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.goods-feedback-comment-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def goods-feedback-comment-list-dto-data
  {
   (ds/req :comments) (s/coll-of goods-feedback-comment-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def goods-feedback-comment-list-dto-spec
  (ds/spec
    {:name ::goods-feedback-comment-list-dto
     :spec goods-feedback-comment-list-dto-data}))
