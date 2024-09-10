(ns партнерский-api-маркета.specs.update-goods-feedback-comment-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-goods-feedback-comment-dto :refer :all]
            )
  (:import (java.io File)))


(def update-goods-feedback-comment-request-data
  {
   (ds/req :feedbackId) int?
   (ds/req :comment) update-goods-feedback-comment-dto-spec
   })

(def update-goods-feedback-comment-request-spec
  (ds/spec
    {:name ::update-goods-feedback-comment-request
     :spec update-goods-feedback-comment-request-data}))
