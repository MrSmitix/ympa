(ns партнерский-api-маркета.specs.get-hidden-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-hidden-offers-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-hidden-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-hidden-offers-result-dto-spec
   })

(def get-hidden-offers-response-spec
  (ds/spec
    {:name ::get-hidden-offers-response
     :spec get-hidden-offers-response-data}))
