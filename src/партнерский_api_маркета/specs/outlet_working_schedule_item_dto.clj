(ns партнерский-api-маркета.specs.outlet-working-schedule-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.day-of-week-type :refer :all]
            [партнерский-api-маркета.specs.day-of-week-type :refer :all]
            )
  (:import (java.io File)))


(def outlet-working-schedule-item-dto-data
  {
   (ds/req :startDay) day-of-week-type-spec
   (ds/req :endDay) day-of-week-type-spec
   (ds/req :startTime) string?
   (ds/req :endTime) string?
   })

(def outlet-working-schedule-item-dto-spec
  (ds/spec
    {:name ::outlet-working-schedule-item-dto
     :spec outlet-working-schedule-item-dto-data}))
