(ns партнерский-api-маркета.specs.offer-availability-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-availability-status-type-data
  {
   })

(def offer-availability-status-type-spec
  (ds/spec
    {:name ::offer-availability-status-type
     :spec offer-availability-status-type-data}))
