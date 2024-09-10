(ns партнерский-api-маркета.specs.offer-card-recommendation-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-card-recommendation-type-data
  {
   })

(def offer-card-recommendation-type-spec
  (ds/spec
    {:name ::offer-card-recommendation-type
     :spec offer-card-recommendation-type-data}))
