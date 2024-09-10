(ns партнерский-api-маркета.specs.calculate-tariffs-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.calculate-tariffs-offer-info-dto :refer :all]
            )
  (:import (java.io File)))


(def calculate-tariffs-response-dto-data
  {
   (ds/req :offers) (s/coll-of calculate-tariffs-offer-info-dto-spec)
   })

(def calculate-tariffs-response-dto-spec
  (ds/spec
    {:name ::calculate-tariffs-response-dto
     :spec calculate-tariffs-response-dto-data}))
