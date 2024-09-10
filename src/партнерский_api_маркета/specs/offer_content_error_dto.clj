(ns партнерский-api-маркета.specs.offer-content-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-content-error-type :refer :all]
            )
  (:import (java.io File)))


(def offer-content-error-dto-data
  {
   (ds/req :type) offer-content-error-type-spec
   (ds/opt :parameterId) int?
   (ds/req :message) string?
   })

(def offer-content-error-dto-spec
  (ds/spec
    {:name ::offer-content-error-dto
     :spec offer-content-error-dto-data}))
