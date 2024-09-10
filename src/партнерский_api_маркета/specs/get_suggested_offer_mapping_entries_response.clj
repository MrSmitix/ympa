(ns партнерский-api-маркета.specs.get-suggested-offer-mapping-entries-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-suggestions-list-dto :refer :all]
            )
  (:import (java.io File)))


(def get-suggested-offer-mapping-entries-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) offer-mapping-suggestions-list-dto-spec
   })

(def get-suggested-offer-mapping-entries-response-spec
  (ds/spec
    {:name ::get-suggested-offer-mapping-entries-response
     :spec get-suggested-offer-mapping-entries-response-data}))
