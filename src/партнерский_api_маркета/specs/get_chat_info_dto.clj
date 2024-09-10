(ns партнерский-api-маркета.specs.get-chat-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.chat-type :refer :all]
            [партнерский-api-маркета.specs.chat-status-type :refer :all]
            )
  (:import (java.io File)))


(def get-chat-info-dto-data
  {
   (ds/req :chatId) int?
   (ds/req :orderId) int?
   (ds/req :type) chat-type-spec
   (ds/req :status) chat-status-type-spec
   (ds/req :createdAt) inst?
   (ds/req :updatedAt) inst?
   })

(def get-chat-info-dto-spec
  (ds/spec
    {:name ::get-chat-info-dto
     :spec get-chat-info-dto-data}))
