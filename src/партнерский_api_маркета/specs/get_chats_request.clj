(ns партнерский-api-маркета.specs.get-chats-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.chat-type :refer :all]
            [партнерский-api-маркета.specs.chat-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-chats-request-data
  {
   (ds/opt :orderIds) (s/coll-of int?)
   (ds/opt :types) (s/coll-of chat-type-spec)
   (ds/opt :statuses) (s/coll-of chat-status-type-spec)
   })

(def get-chats-request-spec
  (ds/spec
    {:name ::get-chats-request
     :spec get-chats-request-data}))
