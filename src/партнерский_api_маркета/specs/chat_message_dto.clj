(ns партнерский-api-маркета.specs.chat-message-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.chat-message-sender-type :refer :all]
            [партнерский-api-маркета.specs.chat-message-payload-dto :refer :all]
            )
  (:import (java.io File)))


(def chat-message-dto-data
  {
   (ds/req :messageId) int?
   (ds/req :createdAt) inst?
   (ds/req :sender) chat-message-sender-type-spec
   (ds/opt :message) string?
   (ds/opt :payload) (s/coll-of chat-message-payload-dto-spec)
   })

(def chat-message-dto-spec
  (ds/spec
    {:name ::chat-message-dto
     :spec chat-message-dto-data}))
