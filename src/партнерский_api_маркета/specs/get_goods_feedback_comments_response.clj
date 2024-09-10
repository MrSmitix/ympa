(ns партнерский-api-маркета.specs.get-goods-feedback-comments-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-list-dto :refer :all]
            )
  (:import (java.io File)))


(def get-goods-feedback-comments-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) goods-feedback-comment-list-dto-spec
   })

(def get-goods-feedback-comments-response-spec
  (ds/spec
    {:name ::get-goods-feedback-comments-response
     :spec get-goods-feedback-comments-response-data}))
