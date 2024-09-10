(ns партнерский-api-маркета.specs.feedback-reaction-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feedback-reaction-status-type-data
  {
   })

(def feedback-reaction-status-type-spec
  (ds/spec
    {:name ::feedback-reaction-status-type
     :spec feedback-reaction-status-type-data}))
