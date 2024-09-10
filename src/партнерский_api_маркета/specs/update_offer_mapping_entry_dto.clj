(ns партнерский-api-маркета.specs.update-offer-mapping-entry-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.update-mappings-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def update-offer-mapping-entry-dto-data
  {
   (ds/opt :mapping) offer-mapping-dto-spec
   (ds/opt :awaitingModerationMapping) offer-mapping-dto-spec
   (ds/opt :rejectedMapping) offer-mapping-dto-spec
   (ds/opt :offer) update-mappings-offer-dto-spec
   })

(def update-offer-mapping-entry-dto-spec
  (ds/spec
    {:name ::update-offer-mapping-entry-dto
     :spec update-offer-mapping-entry-dto-data}))
