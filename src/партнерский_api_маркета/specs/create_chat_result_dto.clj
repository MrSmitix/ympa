(ns партнерский-api-маркета.specs.create-chat-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-result-dto-data
  {
   (ds/req :chatId) int?
   })

(def create-chat-result-dto-spec
  (ds/spec
    {:name ::create-chat-result-dto
     :spec create-chat-result-dto-data}))
