(ns партнерский-api-маркета.specs.suggested-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            )
  (:import (java.io File)))


(def suggested-offer-dto-data
  {
   (ds/opt :offerId) string?
   (ds/opt :name) string?
   (ds/opt :category) string?
   (ds/opt :vendor) string?
   (ds/opt :barcodes) (s/coll-of string?)
   (ds/opt :description) string?
   (ds/opt :vendorCode) string?
   (ds/opt :basicPrice) base-price-dto-spec
   })

(def suggested-offer-dto-spec
  (ds/spec
    {:name ::suggested-offer-dto
     :spec suggested-offer-dto-data}))
