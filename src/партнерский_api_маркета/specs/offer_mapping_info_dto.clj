(ns партнерский-api-маркета.specs.offer-mapping-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-mapping-info-dto-data
  {
   (ds/opt :mapping) offer-mapping-dto-spec
   (ds/opt :awaitingModerationMapping) offer-mapping-dto-spec
   (ds/opt :rejectedMapping) offer-mapping-dto-spec
   })

(def offer-mapping-info-dto-spec
  (ds/spec
    {:name ::offer-mapping-info-dto
     :spec offer-mapping-info-dto-data}))
