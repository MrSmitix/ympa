(ns партнерский-api-маркета.specs.get-category-content-parameters-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.category-content-parameters-dto :refer :all]
            )
  (:import (java.io File)))


(def get-category-content-parameters-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) category-content-parameters-dto-spec
   })

(def get-category-content-parameters-response-spec
  (ds/spec
    {:name ::get-category-content-parameters-response
     :spec get-category-content-parameters-response-data}))
