(ns партнерский-api-маркета.specs.offer-card-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-card-status-type-data
  {
   })

(def offer-card-status-type-spec
  (ds/spec
    {:name ::offer-card-status-type
     :spec offer-card-status-type-data}))
