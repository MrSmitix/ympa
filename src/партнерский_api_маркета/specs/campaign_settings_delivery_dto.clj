(ns партнерский-api-маркета.specs.campaign-settings-delivery-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.campaign-settings-schedule-dto :refer :all]
            )
  (:import (java.io File)))


(def campaign-settings-delivery-dto-data
  {
   (ds/opt :schedule) campaign-settings-schedule-dto-spec
   })

(def campaign-settings-delivery-dto-spec
  (ds/spec
    {:name ::campaign-settings-delivery-dto
     :spec campaign-settings-delivery-dto-data}))
