(ns партнерский-api-маркета.specs.create-outlet-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.outlet-response-dto :refer :all]
            )
  (:import (java.io File)))


(def create-outlet-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) outlet-response-dto-spec
   })

(def create-outlet-response-spec
  (ds/spec
    {:name ::create-outlet-response
     :spec create-outlet-response-data}))
