(ns партнерский-api-маркета.specs.chat-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-type-data
  {
   })

(def chat-type-spec
  (ds/spec
    {:name ::chat-type
     :spec chat-type-data}))
