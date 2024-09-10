(ns партнерский-api-маркета.specs.get-offer-mappings-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-offer-mappings-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-offer-mappings-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-offer-mappings-result-dto-spec
   })

(def get-offer-mappings-response-spec
  (ds/spec
    {:name ::get-offer-mappings-response
     :spec get-offer-mappings-response-data}))
