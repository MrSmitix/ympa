(ns партнерский-api-маркета.specs.logistic-pickup-point-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.pickup-address-dto :refer :all]
            [партнерский-api-маркета.specs.logistic-point-type :refer :all]
            )
  (:import (java.io File)))


(def logistic-pickup-point-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :address) pickup-address-dto-spec
   (ds/opt :instruction) string?
   (ds/opt :type) logistic-point-type-spec
   (ds/opt :logisticPartnerId) int?
   })

(def logistic-pickup-point-dto-spec
  (ds/spec
    {:name ::logistic-pickup-point-dto
     :spec logistic-pickup-point-dto-data}))
