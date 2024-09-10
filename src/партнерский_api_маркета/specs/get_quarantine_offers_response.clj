(ns партнерский-api-маркета.specs.get-quarantine-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-quarantine-offers-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-quarantine-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-quarantine-offers-result-dto-spec
   })

(def get-quarantine-offers-response-spec
  (ds/spec
    {:name ::get-quarantine-offers-response
     :spec get-quarantine-offers-response-data}))
