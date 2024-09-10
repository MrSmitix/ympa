(ns партнерский-api-маркета.specs.outlet-working-schedule-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.outlet-working-schedule-item-dto :refer :all]
            )
  (:import (java.io File)))


(def outlet-working-schedule-dto-data
  {
   (ds/opt :workInHoliday) boolean?
   (ds/req :scheduleItems) (s/coll-of outlet-working-schedule-item-dto-spec)
   })

(def outlet-working-schedule-dto-spec
  (ds/spec
    {:name ::outlet-working-schedule-dto
     :spec outlet-working-schedule-dto-data}))
