(ns партнерский-api-маркета.specs.turnover-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.turnover-type :refer :all]
            )
  (:import (java.io File)))


(def turnover-dto-data
  {
   (ds/req :turnover) turnover-type-spec
   (ds/opt :turnoverDays) float?
   })

(def turnover-dto-spec
  (ds/spec
    {:name ::turnover-dto
     :spec turnover-dto-data}))
