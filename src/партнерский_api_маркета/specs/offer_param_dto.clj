(ns партнерский-api-маркета.specs.offer-param-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-param-dto-data
  {
   (ds/req :name) string?
   (ds/req :value) string?
   })

(def offer-param-dto-spec
  (ds/spec
    {:name ::offer-param-dto
     :spec offer-param-dto-data}))
