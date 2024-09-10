(ns партнерский-api-маркета.specs.offer-price-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-price-response-dto-data
  {
   (ds/opt :id) string?
   (ds/opt :price) price-dto-spec
   (ds/opt :marketSku) int?
   (ds/opt :updatedAt) inst?
   })

(def offer-price-response-dto-spec
  (ds/spec
    {:name ::offer-price-response-dto
     :spec offer-price-response-dto-data}))
