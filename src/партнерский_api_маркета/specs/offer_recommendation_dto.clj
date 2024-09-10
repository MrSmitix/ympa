(ns партнерский-api-маркета.specs.offer-recommendation-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-for-recommendation-dto :refer :all]
            [партнерский-api-маркета.specs.offer-recommendation-info-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-recommendation-dto-data
  {
   (ds/opt :offer) offer-for-recommendation-dto-spec
   (ds/opt :recommendation) offer-recommendation-info-dto-spec
   })

(def offer-recommendation-dto-spec
  (ds/spec
    {:name ::offer-recommendation-dto
     :spec offer-recommendation-dto-data}))
