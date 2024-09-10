(ns партнерский-api-маркета.specs.chat-message-sender-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-message-sender-type-data
  {
   })

(def chat-message-sender-type-spec
  (ds/spec
    {:name ::chat-message-sender-type
     :spec chat-message-sender-type-data}))
