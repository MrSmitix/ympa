(ns партнерский-api-маркета.specs.warehouse-address-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.gps-dto :refer :all]
            )
  (:import (java.io File)))


(def warehouse-address-dto-data
  {
   (ds/req :city) string?
   (ds/opt :street) string?
   (ds/opt :number) string?
   (ds/opt :building) string?
   (ds/opt :block) string?
   (ds/req :gps) gps-dto-spec
   })

(def warehouse-address-dto-spec
  (ds/spec
    {:name ::warehouse-address-dto
     :spec warehouse-address-dto-data}))
