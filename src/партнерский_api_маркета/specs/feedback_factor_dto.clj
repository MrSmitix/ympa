(ns партнерский-api-маркета.specs.feedback-factor-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feedback-factor-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :value) int?
   })

(def feedback-factor-dto-spec
  (ds/spec
    {:name ::feedback-factor-dto
     :spec feedback-factor-dto-data}))
