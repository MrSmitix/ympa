(ns партнерский-api-маркета.specs.update-offer-mappings-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.update-offer-mapping-result-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-mappings-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :results) (s/coll-of update-offer-mapping-result-dto-spec)
   })

(def update-offer-mappings-response-spec
  (ds/spec
    {:name ::update-offer-mappings-response
     :spec update-offer-mappings-response-data}))
