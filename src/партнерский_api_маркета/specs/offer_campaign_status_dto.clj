(ns партнерский-api-маркета.specs.offer-campaign-status-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-campaign-status-type :refer :all]
            )
  (:import (java.io File)))


(def offer-campaign-status-dto-data
  {
   (ds/req :campaignId) int?
   (ds/req :status) offer-campaign-status-type-spec
   })

(def offer-campaign-status-dto-spec
  (ds/spec
    {:name ::offer-campaign-status-dto
     :spec offer-campaign-status-dto-data}))
