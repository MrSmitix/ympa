(ns партнерский-api-маркета.specs.get-categories-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.category-dto :refer :all]
            )
  (:import (java.io File)))


(def get-categories-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) category-dto-spec
   })

(def get-categories-response-spec
  (ds/spec
    {:name ::get-categories-response
     :spec get-categories-response-data}))
