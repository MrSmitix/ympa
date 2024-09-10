(ns партнерский-api-маркета.specs.delete-promo-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.delete-promo-offers-result-dto :refer :all]
            )
  (:import (java.io File)))


(def delete-promo-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) delete-promo-offers-result-dto-spec
   })

(def delete-promo-offers-response-spec
  (ds/spec
    {:name ::delete-promo-offers-response
     :spec delete-promo-offers-response-data}))
