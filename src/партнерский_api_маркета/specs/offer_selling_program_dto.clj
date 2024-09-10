(ns партнерский-api-маркета.specs.offer-selling-program-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.selling-program-type :refer :all]
            [партнерский-api-маркета.specs.offer-selling-program-status-type :refer :all]
            )
  (:import (java.io File)))


(def offer-selling-program-dto-data
  {
   (ds/req :sellingProgram) selling-program-type-spec
   (ds/req :status) offer-selling-program-status-type-spec
   })

(def offer-selling-program-dto-spec
  (ds/spec
    {:name ::offer-selling-program-dto
     :spec offer-selling-program-dto-data}))
