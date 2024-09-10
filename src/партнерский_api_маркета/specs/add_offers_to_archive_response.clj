(ns партнерский-api-маркета.specs.add-offers-to-archive-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.add-offers-to-archive-dto :refer :all]
            )
  (:import (java.io File)))


(def add-offers-to-archive-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) add-offers-to-archive-dto-spec
   })

(def add-offers-to-archive-response-spec
  (ds/spec
    {:name ::add-offers-to-archive-response
     :spec add-offers-to-archive-response-data}))
