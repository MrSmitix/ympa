(ns партнерский-api-маркета.specs.get-chats-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.get-chat-info-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-chats-info-dto-data
  {
   (ds/req :chats) (s/coll-of get-chat-info-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def get-chats-info-dto-spec
  (ds/spec
    {:name ::get-chats-info-dto
     :spec get-chats-info-dto-data}))
