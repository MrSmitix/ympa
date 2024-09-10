(ns партнерский-api-маркета.specs.feedback-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feedback-state-type :refer :all]
            [партнерский-api-маркета.specs.feedback-author-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-comment-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-shop-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-grades-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-order-dto :refer :all]
            )
  (:import (java.io File)))


(def feedback-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :createdAt) inst?
   (ds/opt :text) string?
   (ds/opt :state) feedback-state-type-spec
   (ds/opt :author) feedback-author-dto-spec
   (ds/opt :pro) string?
   (ds/opt :contra) string?
   (ds/req :comments) (s/coll-of feedback-comment-dto-spec)
   (ds/opt :shop) feedback-shop-dto-spec
   (ds/opt :resolved) boolean?
   (ds/opt :verified) boolean?
   (ds/opt :recommend) boolean?
   (ds/opt :grades) feedback-grades-dto-spec
   (ds/opt :order) feedback-order-dto-spec
   })

(def feedback-dto-spec
  (ds/spec
    {:name ::feedback-dto
     :spec feedback-dto-data}))
