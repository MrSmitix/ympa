(ns партнерский-api-маркета.specs.get-goods-feedback-comments-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-goods-feedback-comments-request-data
  {
   (ds/req :feedbackId) int?
   })

(def get-goods-feedback-comments-request-spec
  (ds/spec
    {:name ::get-goods-feedback-comments-request
     :spec get-goods-feedback-comments-request-data}))
