(ns партнерский-api-маркета.specs.campaign-settings-schedule-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.campaign-settings-time-period-dto :refer :all]
            )
  (:import (java.io File)))


(def campaign-settings-schedule-dto-data
  {
   (ds/opt :availableOnHolidays) boolean?
   (ds/req :customHolidays) (s/coll-of string?)
   (ds/req :customWorkingDays) (s/coll-of string?)
   (ds/opt :period) campaign-settings-time-period-dto-spec
   (ds/req :totalHolidays) (s/coll-of string?)
   (ds/req :weeklyHolidays) (s/coll-of int?)
   })

(def campaign-settings-schedule-dto-spec
  (ds/spec
    {:name ::campaign-settings-schedule-dto
     :spec campaign-settings-schedule-dto-data}))
