(ns партнерский-api-маркета.specs.time-period-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.time-unit-type :refer :all]
            )
  (:import (java.io File)))


(def time-period-dto-data
  {
   (ds/req :timePeriod) int?
   (ds/req :timeUnit) time-unit-type-spec
   (ds/opt :comment) string?
   })

(def time-period-dto-spec
  (ds/spec
    {:name ::time-period-dto
     :spec time-period-dto-data}))
