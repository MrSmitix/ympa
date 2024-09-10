(ns партнерский-api-маркета.specs.outlet-address-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def outlet-address-dto-data
  {
   (ds/req :regionId) int?
   (ds/opt :street) string?
   (ds/opt :number) string?
   (ds/opt :building) string?
   (ds/opt :estate) string?
   (ds/opt :block) string?
   (ds/opt :additional) string?
   (ds/opt :km) int?
   (ds/opt :city) string?
   })

(def outlet-address-dto-spec
  (ds/spec
    {:name ::outlet-address-dto
     :spec outlet-address-dto-data}))
