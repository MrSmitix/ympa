(ns партнерский-api-маркета.specs.offer-price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-price-dto-data
  {
   (ds/opt :offerId) string?
   (ds/opt :price) price-dto-spec
   })

(def offer-price-dto-spec
  (ds/spec
    {:name ::offer-price-dto
     :spec offer-price-dto-data}))
