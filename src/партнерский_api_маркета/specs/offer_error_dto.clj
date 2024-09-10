(ns партнерский-api-маркета.specs.offer-error-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-error-dto-data
  {
   (ds/opt :message) string?
   (ds/opt :comment) string?
   })

(def offer-error-dto-spec
  (ds/spec
    {:name ::offer-error-dto
     :spec offer-error-dto-data}))
