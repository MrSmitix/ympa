(ns партнерский-api-маркета.specs.get-chat-history-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-chat-history-request-data
  {
   (ds/opt :messageIdFrom) int?
   })

(def get-chat-history-request-spec
  (ds/spec
    {:name ::get-chat-history-request
     :spec get-chat-history-request-data}))
