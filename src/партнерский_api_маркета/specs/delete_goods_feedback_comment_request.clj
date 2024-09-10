(ns партнерский-api-маркета.specs.delete-goods-feedback-comment-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-goods-feedback-comment-request-data
  {
   (ds/req :id) int?
   })

(def delete-goods-feedback-comment-request-spec
  (ds/spec
    {:name ::delete-goods-feedback-comment-request
     :spec delete-goods-feedback-comment-request-data}))
