(ns партнерский-api-маркета.specs.create-chat-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.create-chat-result-dto :refer :all]
            )
  (:import (java.io File)))


(def create-chat-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) create-chat-result-dto-spec
   })

(def create-chat-response-spec
  (ds/spec
    {:name ::create-chat-response
     :spec create-chat-response-data}))
