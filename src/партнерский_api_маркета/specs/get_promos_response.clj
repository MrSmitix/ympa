(ns партнерский-api-маркета.specs.get-promos-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-promos-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-promos-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-promos-result-dto-spec
   })

(def get-promos-response-spec
  (ds/spec
    {:name ::get-promos-response
     :spec get-promos-response-data}))
