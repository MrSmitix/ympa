(ns партнерский-api-маркета.specs.calculate-tariffs-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.calculate-tariffs-parameters-dto :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def calculate-tariffs-request-data
  {
   (ds/req :parameters) calculate-tariffs-parameters-dto-spec
   (ds/req :offers) (s/coll-of calculate-tariffs-offer-dto-spec)
   })

(def calculate-tariffs-request-spec
  (ds/spec
    {:name ::calculate-tariffs-request
     :spec calculate-tariffs-request-data}))
