(ns партнерский-api-маркета.specs.warehouse-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.warehouse-address-dto :refer :all]
            )
  (:import (java.io File)))


(def warehouse-dto-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :campaignId) int?
   (ds/req :express) boolean?
   (ds/opt :address) warehouse-address-dto-spec
   })

(def warehouse-dto-spec
  (ds/spec
    {:name ::warehouse-dto
     :spec warehouse-dto-data}))
