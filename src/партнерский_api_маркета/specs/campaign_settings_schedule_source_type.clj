(ns партнерский-api-маркета.specs.campaign-settings-schedule-source-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-settings-schedule-source-type-data
  {
   })

(def campaign-settings-schedule-source-type-spec
  (ds/spec
    {:name ::campaign-settings-schedule-source-type
     :spec campaign-settings-schedule-source-type-data}))
