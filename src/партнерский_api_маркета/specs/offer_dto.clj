(ns партнерский-api-маркета.specs.offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def offer-dto-data
  {
   (ds/opt :price) float?
   (ds/opt :feedId) int?
   (ds/opt :id) string?
   (ds/opt :shopCategoryId) string?
   (ds/opt :marketCategoryId) int?
   (ds/opt :preDiscountPrice) float?
   (ds/opt :discount) int?
   (ds/opt :cutPrice) boolean?
   (ds/opt :url) string?
   (ds/req :modelId) int?
   (ds/opt :name) string?
   (ds/opt :currency) currency-type-spec
   (ds/opt :bid) float?
   (ds/opt :cbid) float?
   (ds/opt :fee) float?
   (ds/opt :blocked) boolean?
   })

(def offer-dto-spec
  (ds/spec
    {:name ::offer-dto
     :spec offer-dto-data}))
