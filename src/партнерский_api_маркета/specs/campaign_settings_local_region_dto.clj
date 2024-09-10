(ns партнерский-api-маркета.specs.campaign-settings-local-region-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.region-type :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-schedule-source-type :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-delivery-dto :refer :all]
            )
  (:import (java.io File)))


(def campaign-settings-local-region-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :type) region-type-spec
   (ds/opt :deliveryOptionsSource) campaign-settings-schedule-source-type-spec
   (ds/opt :delivery) campaign-settings-delivery-dto-spec
   })

(def campaign-settings-local-region-dto-spec
  (ds/spec
    {:name ::campaign-settings-local-region-dto
     :spec campaign-settings-local-region-dto-data}))
