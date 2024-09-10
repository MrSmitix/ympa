(ns партнерский-api-маркета.specs.get-feedback-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.feedback-list-dto :refer :all]
            )
  (:import (java.io File)))


(def get-feedback-list-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) feedback-list-dto-spec
   })

(def get-feedback-list-response-spec
  (ds/spec
    {:name ::get-feedback-list-response
     :spec get-feedback-list-response-data}))
