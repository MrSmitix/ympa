(ns партнерский-api-маркета.specs.get-suggested-offer-mappings-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.suggested-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def get-suggested-offer-mappings-request-data
  {
   (ds/opt :offers) (s/coll-of suggested-offer-dto-spec)
   })

(def get-suggested-offer-mappings-request-spec
  (ds/spec
    {:name ::get-suggested-offer-mappings-request
     :spec get-suggested-offer-mappings-request-data}))
