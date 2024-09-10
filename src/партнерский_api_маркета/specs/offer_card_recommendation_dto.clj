(ns партнерский-api-маркета.specs.offer-card-recommendation-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-card-recommendation-type :refer :all]
            )
  (:import (java.io File)))


(def offer-card-recommendation-dto-data
  {
   (ds/req :type) offer-card-recommendation-type-spec
   (ds/opt :percent) int?
   })

(def offer-card-recommendation-dto-spec
  (ds/spec
    {:name ::offer-card-recommendation-dto
     :spec offer-card-recommendation-dto-data}))
