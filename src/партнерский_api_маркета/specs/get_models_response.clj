(ns партнерский-api-маркета.specs.get-models-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.model-dto :refer :all]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def get-models-response-data
  {
   (ds/req :models) (s/coll-of model-dto-spec)
   (ds/opt :currency) currency-type-spec
   (ds/opt :regionId) int?
   })

(def get-models-response-spec
  (ds/spec
    {:name ::get-models-response
     :spec get-models-response-data}))
