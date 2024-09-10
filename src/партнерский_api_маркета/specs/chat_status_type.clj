(ns партнерский-api-маркета.specs.chat-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-status-type-data
  {
   })

(def chat-status-type-spec
  (ds/spec
    {:name ::chat-status-type
     :spec chat-status-type-data}))
