(ns партнерский-api-маркета.specs.offer-recommendation-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            [партнерский-api-маркета.specs.price-competitiveness-thresholds-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-recommendation-info-dto-data
  {
   (ds/opt :offerId) string?
   (ds/opt :recommendedCofinancePrice) base-price-dto-spec
   (ds/opt :competitivenessThresholds) price-competitiveness-thresholds-dto-spec
   })

(def offer-recommendation-info-dto-spec
  (ds/spec
    {:name ::offer-recommendation-info-dto
     :spec offer-recommendation-info-dto-data}))
