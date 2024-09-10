(ns партнерский-api-маркета.specs.get-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-manual-dto :refer :all]
            [партнерский-api-маркета.specs.offer-weight-dimensions-dto :refer :all]
            [партнерский-api-маркета.specs.time-period-dto :refer :all]
            [партнерский-api-маркета.specs.time-period-dto :refer :all]
            [партнерский-api-маркета.specs.time-period-dto :refer :all]
            [партнерский-api-маркета.specs.offer-condition-dto :refer :all]
            [партнерский-api-маркета.specs.offer-type :refer :all]
            [партнерский-api-маркета.specs.age-dto :refer :all]
            [партнерский-api-маркета.specs.offer-param-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-with-discount-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-dto :refer :all]
            [партнерский-api-маркета.specs.offer-card-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-campaign-status-dto :refer :all]
            [партнерский-api-маркета.specs.offer-selling-program-dto :refer :all]
            )
  (:import (java.io File)))


(def get-offer-dto-data
  {
   (ds/req :offerId) string?
   (ds/opt :name) string?
   (ds/opt :marketCategoryId) int?
   (ds/opt :category) string?
   (ds/opt :pictures) (s/coll-of string?)
   (ds/opt :videos) (s/coll-of string?)
   (ds/opt :manuals) (s/coll-of offer-manual-dto-spec)
   (ds/opt :vendor) string?
   (ds/opt :barcodes) (s/coll-of string?)
   (ds/opt :description) string?
   (ds/opt :manufacturerCountries) (s/coll-of string?)
   (ds/opt :weightDimensions) offer-weight-dimensions-dto-spec
   (ds/opt :vendorCode) string?
   (ds/opt :tags) (s/coll-of string?)
   (ds/opt :shelfLife) time-period-dto-spec
   (ds/opt :lifeTime) time-period-dto-spec
   (ds/opt :guaranteePeriod) time-period-dto-spec
   (ds/opt :customsCommodityCode) string?
   (ds/opt :certificates) (s/coll-of string?)
   (ds/opt :boxCount) int?
   (ds/opt :condition) offer-condition-dto-spec
   (ds/opt :type) offer-type-spec
   (ds/opt :downloadable) boolean?
   (ds/opt :adult) boolean?
   (ds/opt :age) age-dto-spec
   (ds/opt :params) (s/coll-of offer-param-dto-spec)
   (ds/opt :basicPrice) get-price-with-discount-dto-spec
   (ds/opt :purchasePrice) get-price-dto-spec
   (ds/opt :additionalExpenses) get-price-dto-spec
   (ds/opt :cofinancePrice) get-price-dto-spec
   (ds/opt :cardStatus) offer-card-status-type-spec
   (ds/opt :campaigns) (s/coll-of offer-campaign-status-dto-spec)
   (ds/opt :sellingPrograms) (s/coll-of offer-selling-program-dto-spec)
   (ds/opt :archived) boolean?
   })

(def get-offer-dto-spec
  (ds/spec
    {:name ::get-offer-dto
     :spec get-offer-dto-data}))
