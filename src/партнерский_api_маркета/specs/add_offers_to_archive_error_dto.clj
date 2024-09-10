(ns партнерский-api-маркета.specs.add-offers-to-archive-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.add-offers-to-archive-error-type :refer :all]
            )
  (:import (java.io File)))


(def add-offers-to-archive-error-dto-data
  {
   (ds/req :offerId) string?
   (ds/req :error) add-offers-to-archive-error-type-spec
   })

(def add-offers-to-archive-error-dto-spec
  (ds/spec
    {:name ::add-offers-to-archive-error-dto
     :spec add-offers-to-archive-error-dto-data}))
