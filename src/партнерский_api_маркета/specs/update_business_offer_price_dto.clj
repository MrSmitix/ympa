(ns партнерский-api-маркета.specs.update-business-offer-price-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-price-with-discount-dto :refer :all]
            )
  (:import (java.io File)))


(def update-business-offer-price-dto-data
  {
   (ds/req :offerId) string?
   (ds/req :price) update-price-with-discount-dto-spec
   })

(def update-business-offer-price-dto-spec
  (ds/spec
    {:name ::update-business-offer-price-dto
     :spec update-business-offer-price-dto-data}))
