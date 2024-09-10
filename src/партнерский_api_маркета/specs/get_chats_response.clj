(ns партнерский-api-маркета.specs.get-chats-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-chats-info-dto :refer :all]
            )
  (:import (java.io File)))


(def get-chats-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-chats-info-dto-spec
   })

(def get-chats-response-spec
  (ds/spec
    {:name ::get-chats-response
     :spec get-chats-response-data}))
