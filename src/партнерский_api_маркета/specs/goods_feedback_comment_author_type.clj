(ns партнерский-api-маркета.specs.goods-feedback-comment-author-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def goods-feedback-comment-author-type-data
  {
   })

(def goods-feedback-comment-author-type-spec
  (ds/spec
    {:name ::goods-feedback-comment-author-type
     :spec goods-feedback-comment-author-type-data}))
