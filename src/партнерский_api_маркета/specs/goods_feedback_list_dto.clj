(ns партнерский-api-маркета.specs.goods-feedback-list-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.goods-feedback-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def goods-feedback-list-dto-data
  {
   (ds/req :feedbacks) (s/coll-of goods-feedback-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def goods-feedback-list-dto-spec
  (ds/spec
    {:name ::goods-feedback-list-dto
     :spec goods-feedback-list-dto-data}))
