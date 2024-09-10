(ns партнерский-api-маркета.specs.calculate-tariffs-parameters-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.selling-program-type :refer :all]
            [партнерский-api-маркета.specs.payment-frequency-type :refer :all]
            )
  (:import (java.io File)))


(def calculate-tariffs-parameters-dto-data
  {
   (ds/opt :campaignId) int?
   (ds/opt :sellingProgram) selling-program-type-spec
   (ds/opt :frequency) payment-frequency-type-spec
   })

(def calculate-tariffs-parameters-dto-spec
  (ds/spec
    {:name ::calculate-tariffs-parameters-dto
     :spec calculate-tariffs-parameters-dto-data}))
