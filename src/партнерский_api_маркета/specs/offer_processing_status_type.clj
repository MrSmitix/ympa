(ns партнерский-api-маркета.specs.offer-processing-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-processing-status-type-data
  {
   })

(def offer-processing-status-type-spec
  (ds/spec
    {:name ::offer-processing-status-type
     :spec offer-processing-status-type-data}))
