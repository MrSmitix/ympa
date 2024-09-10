(ns партнерский-api-маркета.specs.feedback-shop-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feedback-shop-dto-data
  {
   (ds/opt :name) string?
   })

(def feedback-shop-dto-spec
  (ds/spec
    {:name ::feedback-shop-dto
     :spec feedback-shop-dto-data}))
