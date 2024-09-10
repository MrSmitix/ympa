(ns партнерский-api-маркета.specs.chat-messages-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.chat-message-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def chat-messages-result-dto-data
  {
   (ds/req :orderId) int?
   (ds/req :messages) (s/coll-of chat-message-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def chat-messages-result-dto-spec
  (ds/spec
    {:name ::chat-messages-result-dto
     :spec chat-messages-result-dto-data}))
