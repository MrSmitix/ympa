(ns партнерский-api-маркета.specs.delete-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.delete-offers-dto :refer :all]
            )
  (:import (java.io File)))


(def delete-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) delete-offers-dto-spec
   })

(def delete-offers-response-spec
  (ds/spec
    {:name ::delete-offers-response
     :spec delete-offers-response-data}))
