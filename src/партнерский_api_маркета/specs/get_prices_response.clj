(ns партнерский-api-маркета.specs.get-prices-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-price-list-response-dto :refer :all]
            )
  (:import (java.io File)))


(def get-prices-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) offer-price-list-response-dto-spec
   })

(def get-prices-response-spec
  (ds/spec
    {:name ::get-prices-response
     :spec get-prices-response-data}))
