(ns партнерский-api-маркета.specs.search-models-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.model-dto :refer :all]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            [партнерский-api-маркета.specs.flipping-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def search-models-response-data
  {
   (ds/req :models) (s/coll-of model-dto-spec)
   (ds/opt :currency) currency-type-spec
   (ds/opt :regionId) int?
   (ds/opt :pager) flipping-pager-dto-spec
   })

(def search-models-response-spec
  (ds/spec
    {:name ::search-models-response
     :spec search-models-response-data}))
