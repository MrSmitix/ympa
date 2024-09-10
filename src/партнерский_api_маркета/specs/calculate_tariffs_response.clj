(ns партнерский-api-маркета.specs.calculate-tariffs-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-response-dto :refer :all]
            )
  (:import (java.io File)))


(def calculate-tariffs-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) calculate-tariffs-response-dto-spec
   })

(def calculate-tariffs-response-spec
  (ds/spec
    {:name ::calculate-tariffs-response
     :spec calculate-tariffs-response-data}))
