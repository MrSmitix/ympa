(ns партнерский-api-маркета.specs.send-message-to-chat-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def send-message-to-chat-request-data
  {
   (ds/req :message) string?
   })

(def send-message-to-chat-request-spec
  (ds/spec
    {:name ::send-message-to-chat-request
     :spec send-message-to-chat-request-data}))
