(ns партнерский-api-маркета.specs.price-competitiveness-thresholds-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            )
  (:import (java.io File)))


(def price-competitiveness-thresholds-dto-data
  {
   (ds/opt :optimalPrice) base-price-dto-spec
   (ds/opt :averagePrice) base-price-dto-spec
   })

(def price-competitiveness-thresholds-dto-spec
  (ds/spec
    {:name ::price-competitiveness-thresholds-dto
     :spec price-competitiveness-thresholds-dto-data}))
