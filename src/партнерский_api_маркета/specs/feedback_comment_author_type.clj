(ns партнерский-api-маркета.specs.feedback-comment-author-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feedback-comment-author-type-data
  {
   })

(def feedback-comment-author-type-spec
  (ds/spec
    {:name ::feedback-comment-author-type
     :spec feedback-comment-author-type-data}))
