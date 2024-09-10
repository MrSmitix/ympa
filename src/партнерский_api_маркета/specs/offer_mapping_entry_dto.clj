(ns партнерский-api-маркета.specs.offer-mapping-entry-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.mappings-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-mapping-entry-dto-data
  {
   (ds/opt :mapping) offer-mapping-dto-spec
   (ds/opt :awaitingModerationMapping) offer-mapping-dto-spec
   (ds/opt :rejectedMapping) offer-mapping-dto-spec
   (ds/opt :offer) mappings-offer-dto-spec
   })

(def offer-mapping-entry-dto-spec
  (ds/spec
    {:name ::offer-mapping-entry-dto
     :spec offer-mapping-entry-dto-data}))
