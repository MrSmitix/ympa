(ns партнерский-api-маркета.specs.campaign-settings-time-period-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-settings-time-period-dto-data
  {
   (ds/opt :fromDate) string?
   (ds/opt :toDate) string?
   })

(def campaign-settings-time-period-dto-spec
  (ds/spec
    {:name ::campaign-settings-time-period-dto
     :spec campaign-settings-time-period-dto-data}))
