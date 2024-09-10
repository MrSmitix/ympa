(ns партнерский-api-маркета.specs.offer-content-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.parameter-value-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-content-dto-data
  {
   (ds/req :offerId) string?
   (ds/req :categoryId) int?
   (ds/req :parameterValues) (s/coll-of parameter-value-dto-spec)
   })

(def offer-content-dto-spec
  (ds/spec
    {:name ::offer-content-dto
     :spec offer-content-dto-data}))
