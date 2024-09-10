(ns партнерский-api-маркета.specs.create-chat-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-request-data
  {
   (ds/req :orderId) int?
   })

(def create-chat-request-spec
  (ds/spec
    {:name ::create-chat-request
     :spec create-chat-request-data}))
