(ns партнерский-api-маркета.specs.delete-offers-from-archive-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.delete-offers-from-archive-dto :refer :all]
            )
  (:import (java.io File)))


(def delete-offers-from-archive-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) delete-offers-from-archive-dto-spec
   })

(def delete-offers-from-archive-response-spec
  (ds/spec
    {:name ::delete-offers-from-archive-response
     :spec delete-offers-from-archive-response-data}))
