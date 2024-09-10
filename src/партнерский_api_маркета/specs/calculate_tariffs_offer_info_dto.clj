(ns партнерский-api-маркета.specs.calculate-tariffs-offer-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.calculate-tariffs-offer-dto :refer :all]
            [партнерский-api-маркета.specs.calculated-tariff-dto :refer :all]
            )
  (:import (java.io File)))


(def calculate-tariffs-offer-info-dto-data
  {
   (ds/req :offer) calculate-tariffs-offer-dto-spec
   (ds/req :tariffs) (s/coll-of calculated-tariff-dto-spec)
   })

(def calculate-tariffs-offer-info-dto-spec
  (ds/spec
    {:name ::calculate-tariffs-offer-info-dto
     :spec calculate-tariffs-offer-info-dto-data}))
