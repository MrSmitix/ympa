(ns партнерский-api-маркета.specs.suggest-offer-price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def suggest-offer-price-dto-data
  {
   (ds/opt :offerId) string?
   (ds/opt :marketSku) int?
   })

(def suggest-offer-price-dto-spec
  (ds/spec
    {:name ::suggest-offer-price-dto
     :spec suggest-offer-price-dto-data}))
