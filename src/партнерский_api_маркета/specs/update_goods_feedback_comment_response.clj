(ns партнерский-api-маркета.specs.update-goods-feedback-comment-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-dto :refer :all]
            )
  (:import (java.io File)))


(def update-goods-feedback-comment-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) goods-feedback-comment-dto-spec
   })

(def update-goods-feedback-comment-response-spec
  (ds/spec
    {:name ::update-goods-feedback-comment-response
     :spec update-goods-feedback-comment-response-data}))
