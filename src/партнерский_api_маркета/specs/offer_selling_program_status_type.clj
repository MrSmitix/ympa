(ns партнерский-api-маркета.specs.offer-selling-program-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-selling-program-status-type-data
  {
   })

(def offer-selling-program-status-type-spec
  (ds/spec
    {:name ::offer-selling-program-status-type
     :spec offer-selling-program-status-type-data}))
