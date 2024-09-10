(ns партнерский-api-маркета.specs.campaign-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.business-dto :refer :all]
            [партнерский-api-маркета.specs.placement-type :refer :all]
            )
  (:import (java.io File)))


(def campaign-dto-data
  {
   (ds/opt :domain) string?
   (ds/opt :id) int?
   (ds/opt :clientId) int?
   (ds/opt :business) business-dto-spec
   (ds/opt :placementType) placement-type-spec
   })

(def campaign-dto-spec
  (ds/spec
    {:name ::campaign-dto
     :spec campaign-dto-data}))
