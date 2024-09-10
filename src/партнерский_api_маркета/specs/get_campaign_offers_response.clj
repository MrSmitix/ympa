(ns партнерский-api-маркета.specs.get-campaign-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-campaign-offers-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-campaign-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-campaign-offers-result-dto-spec
   })

(def get-campaign-offers-response-spec
  (ds/spec
    {:name ::get-campaign-offers-response
     :spec get-campaign-offers-response-data}))
