(ns партнерский-api-маркета.specs.update-offer-content-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.update-offer-content-result-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-content-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :results) (s/coll-of update-offer-content-result-dto-spec)
   })

(def update-offer-content-response-spec
  (ds/spec
    {:name ::update-offer-content-response
     :spec update-offer-content-response-data}))
