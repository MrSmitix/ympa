(ns партнерский-api-маркета.specs.search-shipments-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.search-shipments-response-dto :refer :all]
            )
  (:import (java.io File)))


(def search-shipments-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) search-shipments-response-dto-spec
   })

(def search-shipments-response-spec
  (ds/spec
    {:name ::search-shipments-response
     :spec search-shipments-response-data}))
