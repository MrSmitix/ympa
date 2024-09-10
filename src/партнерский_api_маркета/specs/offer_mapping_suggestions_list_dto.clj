(ns партнерский-api-маркета.specs.offer-mapping-suggestions-list-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.enriched-mappings-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-mapping-suggestions-list-dto-data
  {
   (ds/req :offers) (s/coll-of enriched-mappings-offer-dto-spec)
   })

(def offer-mapping-suggestions-list-dto-spec
  (ds/spec
    {:name ::offer-mapping-suggestions-list-dto
     :spec offer-mapping-suggestions-list-dto-data}))
