(ns партнерский-api-маркета.specs.offer-campaign-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-campaign-status-type-data
  {
   })

(def offer-campaign-status-type-spec
  (ds/spec
    {:name ::offer-campaign-status-type
     :spec offer-campaign-status-type-data}))
