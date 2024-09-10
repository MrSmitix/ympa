(ns партнерский-api-маркета.specs.feedback-grades-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feedback-factor-dto :refer :all]
            )
  (:import (java.io File)))


(def feedback-grades-dto-data
  {
   (ds/opt :average) float?
   (ds/opt :agreeCount) int?
   (ds/opt :rejectCount) int?
   (ds/req :factors) (s/coll-of feedback-factor-dto-spec)
   })

(def feedback-grades-dto-spec
  (ds/spec
    {:name ::feedback-grades-dto
     :spec feedback-grades-dto-data}))
