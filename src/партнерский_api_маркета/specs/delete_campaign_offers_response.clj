(ns партнерский-api-маркета.specs.delete-campaign-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.delete-campaign-offers-dto :refer :all]
            )
  (:import (java.io File)))


(def delete-campaign-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) delete-campaign-offers-dto-spec
   })

(def delete-campaign-offers-response-spec
  (ds/spec
    {:name ::delete-campaign-offers-response
     :spec delete-campaign-offers-response-data}))
