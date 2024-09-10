(ns партнерский-api-маркета.specs.generate-goods-feedback-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generate-goods-feedback-request-data
  {
   (ds/req :businessId) int?
   })

(def generate-goods-feedback-request-spec
  (ds/spec
    {:name ::generate-goods-feedback-request
     :spec generate-goods-feedback-request-data}))
