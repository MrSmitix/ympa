(ns партнерский-api-маркета.specs.update-promo-offers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.update-promo-offers-result-dto :refer :all]
            )
  (:import (java.io File)))


(def update-promo-offers-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) update-promo-offers-result-dto-spec
   })

(def update-promo-offers-response-spec
  (ds/spec
    {:name ::update-promo-offers-response
     :spec update-promo-offers-response-data}))
