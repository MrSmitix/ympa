(ns партнерский-api-маркета.specs.offer-price-by-offer-ids-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-price-by-offer-ids-response-dto-data
  {
   (ds/opt :offerId) string?
   (ds/opt :price) price-dto-spec
   (ds/opt :updatedAt) inst?
   })

(def offer-price-by-offer-ids-response-dto-spec
  (ds/spec
    {:name ::offer-price-by-offer-ids-response-dto
     :spec offer-price-by-offer-ids-response-dto-data}))
