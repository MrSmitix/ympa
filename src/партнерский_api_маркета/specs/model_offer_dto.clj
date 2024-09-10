(ns партнерский-api-маркета.specs.model-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def model-offer-dto-data
  {
   (ds/opt :discount) int?
   (ds/opt :name) string?
   (ds/opt :pos) int?
   (ds/opt :preDiscountPrice) float?
   (ds/opt :price) float?
   (ds/opt :regionId) int?
   (ds/opt :shippingCost) float?
   (ds/opt :shopName) string?
   (ds/opt :shopRating) int?
   (ds/opt :inStock) int?
   })

(def model-offer-dto-spec
  (ds/spec
    {:name ::model-offer-dto
     :spec model-offer-dto-data}))
