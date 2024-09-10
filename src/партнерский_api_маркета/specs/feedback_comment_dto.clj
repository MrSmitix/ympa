(ns партнерский-api-маркета.specs.feedback-comment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feedback-comment-author-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-comment-dto :refer :all]
            )
  (:import (java.io File)))


(def feedback-comment-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :parentId) int?
   (ds/opt :body) string?
   (ds/opt :createdAt) inst?
   (ds/opt :updatedAt) inst?
   (ds/opt :author) feedback-comment-author-dto-spec
   (ds/opt :children) (s/coll-of feedback-comment-dto-spec)
   })

(def feedback-comment-dto-spec
  (ds/spec
    {:name ::feedback-comment-dto
     :spec feedback-comment-dto-data}))
