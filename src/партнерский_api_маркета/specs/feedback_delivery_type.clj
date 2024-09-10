(ns партнерский-api-маркета.specs.feedback-delivery-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feedback-delivery-type-data
  {
   })

(def feedback-delivery-type-spec
  (ds/spec
    {:name ::feedback-delivery-type
     :spec feedback-delivery-type-data}))
