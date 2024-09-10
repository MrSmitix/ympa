(ns партнерский-api-маркета.specs.suggest-prices-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.suggest-prices-result-dto :refer :all]
            )
  (:import (java.io File)))


(def suggest-prices-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) suggest-prices-result-dto-spec
   })

(def suggest-prices-response-spec
  (ds/spec
    {:name ::suggest-prices-response
     :spec suggest-prices-response-data}))
