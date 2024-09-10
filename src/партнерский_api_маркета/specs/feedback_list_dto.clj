(ns партнерский-api-маркета.specs.feedback-list-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-dto :refer :all]
            )
  (:import (java.io File)))


(def feedback-list-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :feedbackList) (s/coll-of feedback-dto-spec)
   })

(def feedback-list-dto-spec
  (ds/spec
    {:name ::feedback-list-dto
     :spec feedback-list-dto-data}))
