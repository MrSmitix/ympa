(ns партнерский-api-маркета.specs.get-goods-feedback-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feedback-reaction-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-goods-feedback-request-data
  {
   (ds/opt :dateTimeFrom) inst?
   (ds/opt :dateTimeTo) inst?
   (ds/opt :reactionStatus) feedback-reaction-status-type-spec
   (ds/opt :ratingValues) (s/coll-of int?)
   (ds/opt :modelIds) (s/coll-of int?)
   (ds/opt :paid) boolean?
   })

(def get-goods-feedback-request-spec
  (ds/spec
    {:name ::get-goods-feedback-request
     :spec get-goods-feedback-request-data}))
