(ns партнерский-api-маркета.specs.get-chat-history-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.chat-messages-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-chat-history-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) chat-messages-result-dto-spec
   })

(def get-chat-history-response-spec
  (ds/spec
    {:name ::get-chat-history-response
     :spec get-chat-history-response-data}))
