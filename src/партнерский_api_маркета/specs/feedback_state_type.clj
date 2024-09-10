(ns партнерский-api-маркета.specs.feedback-state-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feedback-state-type-data
  {
   })

(def feedback-state-type-spec
  (ds/spec
    {:name ::feedback-state-type
     :spec feedback-state-type-data}))
