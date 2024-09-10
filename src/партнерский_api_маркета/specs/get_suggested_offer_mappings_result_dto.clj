(ns партнерский-api-маркета.specs.get-suggested-offer-mappings-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.suggested-offer-mapping-dto :refer :all]
            )
  (:import (java.io File)))


(def get-suggested-offer-mappings-result-dto-data
  {
   (ds/req :offers) (s/coll-of suggested-offer-mapping-dto-spec)
   })

(def get-suggested-offer-mappings-result-dto-spec
  (ds/spec
    {:name ::get-suggested-offer-mappings-result-dto
     :spec get-suggested-offer-mappings-result-dto-data}))
