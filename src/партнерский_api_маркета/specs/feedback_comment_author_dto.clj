(ns партнерский-api-маркета.specs.feedback-comment-author-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feedback-comment-author-type :refer :all]
            )
  (:import (java.io File)))


(def feedback-comment-author-dto-data
  {
   (ds/opt :type) feedback-comment-author-type-spec
   (ds/opt :name) string?
   })

(def feedback-comment-author-dto-spec
  (ds/spec
    {:name ::feedback-comment-author-dto
     :spec feedback-comment-author-dto-data}))
