(ns партнерский-api-маркета.specs.chat-message-payload-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-message-payload-dto-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   (ds/req :size) int?
   })

(def chat-message-payload-dto-spec
  (ds/spec
    {:name ::chat-message-payload-dto
     :spec chat-message-payload-dto-data}))
