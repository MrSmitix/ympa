(ns партнерский-api-маркета.specs.get-offer-recommendations-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-recommendations-result-dto :refer :all]
            )
  (:import (java.io File)))


(def get-offer-recommendations-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) offer-recommendations-result-dto-spec
   })

(def get-offer-recommendations-response-spec
  (ds/spec
    {:name ::get-offer-recommendations-response
     :spec get-offer-recommendations-response-data}))
