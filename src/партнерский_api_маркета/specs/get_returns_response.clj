(ns партнерский-api-маркета.specs.get-returns-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.paged-returns-dto :refer :all]
            )
  (:import (java.io File)))


(def get-returns-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) paged-returns-dto-spec
   })

(def get-returns-response-spec
  (ds/spec
    {:name ::get-returns-response
     :spec get-returns-response-data}))
