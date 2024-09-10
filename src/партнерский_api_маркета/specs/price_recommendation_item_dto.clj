(ns партнерский-api-маркета.specs.price-recommendation-item-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def price-recommendation-item-dto-data
  {
   (ds/req :campaignId) int?
   (ds/req :price) float?
   })

(def price-recommendation-item-dto-spec
  (ds/spec
    {:name ::price-recommendation-item-dto
     :spec price-recommendation-item-dto-data}))
