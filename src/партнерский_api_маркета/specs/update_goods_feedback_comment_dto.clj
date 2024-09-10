(ns партнерский-api-маркета.specs.update-goods-feedback-comment-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-goods-feedback-comment-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :parentId) int?
   (ds/req :text) string?
   })

(def update-goods-feedback-comment-dto-spec
  (ds/spec
    {:name ::update-goods-feedback-comment-dto
     :spec update-goods-feedback-comment-dto-data}))
