(ns партнерский-api-маркета.specs.offer-content-error-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-content-error-type-data
  {
   })

(def offer-content-error-type-spec
  (ds/spec
    {:name ::offer-content-error-type
     :spec offer-content-error-type-data}))
