(ns партнерский-api-маркета.specs.skip-goods-feedback-reaction-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def skip-goods-feedback-reaction-request-data
  {
   (ds/req :feedbackIds) (s/coll-of int?)
   })

(def skip-goods-feedback-reaction-request-spec
  (ds/spec
    {:name ::skip-goods-feedback-reaction-request
     :spec skip-goods-feedback-reaction-request-data}))
