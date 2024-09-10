(ns партнерский-api-маркета.specs.offer-mapping-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-mapping-error-type :refer :all]
            )
  (:import (java.io File)))


(def offer-mapping-error-dto-data
  {
   (ds/req :type) offer-mapping-error-type-spec
   (ds/opt :parameterId) int?
   (ds/req :message) string?
   })

(def offer-mapping-error-dto-spec
  (ds/spec
    {:name ::offer-mapping-error-dto
     :spec offer-mapping-error-dto-data}))
