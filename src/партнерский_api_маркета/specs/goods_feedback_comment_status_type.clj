(ns партнерский-api-маркета.specs.goods-feedback-comment-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def goods-feedback-comment-status-type-data
  {
   })

(def goods-feedback-comment-status-type-spec
  (ds/spec
    {:name ::goods-feedback-comment-status-type
     :spec goods-feedback-comment-status-type-data}))
