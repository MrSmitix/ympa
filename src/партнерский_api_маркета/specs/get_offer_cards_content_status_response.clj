(ns партнерский-api-маркета.specs.get-offer-cards-content-status-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-cards-content-status-dto :refer :all]
            )
  (:import (java.io File)))


(def get-offer-cards-content-status-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) offer-cards-content-status-dto-spec
   })

(def get-offer-cards-content-status-response-spec
  (ds/spec
    {:name ::get-offer-cards-content-status-response
     :spec get-offer-cards-content-status-response-data}))
