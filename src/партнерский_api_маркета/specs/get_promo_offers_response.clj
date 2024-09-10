(ns партнерский-api-маркета.specs.get-promo-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-promo-offers-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-promo-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-promo-offers-result-dto-spec
   })

(def get-promo-offers-response-spec
  (ds/spec
    {:name ::get-promo-offers-response
     :spec get-promo-offers-response-data}))
