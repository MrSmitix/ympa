(ns партнерский-api-маркета.specs.get-categories-max-sale-quantum-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.max-sale-quantum-dto :refer :all]
            [партнерский-api-маркета.specs.category-error-dto :refer :all]
            )
  (:import (java.io File)))


(def get-categories-max-sale-quantum-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/req :results) (s/coll-of max-sale-quantum-dto-spec)
   (ds/opt :errors) (s/coll-of category-error-dto-spec)
   })

(def get-categories-max-sale-quantum-response-spec
  (ds/spec
    {:name ::get-categories-max-sale-quantum-response
     :spec get-categories-max-sale-quantum-response-data}))
