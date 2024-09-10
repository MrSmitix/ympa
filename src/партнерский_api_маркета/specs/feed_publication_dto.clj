(ns партнерский-api-маркета.specs.feed-publication-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-status-type :refer :all]
            [партнерский-api-маркета.specs.feed-publication-full-dto :refer :all]
            [партнерский-api-маркета.specs.feed-publication-price-and-stock-update-dto :refer :all]
            )
  (:import (java.io File)))


(def feed-publication-dto-data
  {
   (ds/opt :status) feed-status-type-spec
   (ds/opt :full) feed-publication-full-dto-spec
   (ds/opt :priceAndStockUpdate) feed-publication-price-and-stock-update-dto-spec
   })

(def feed-publication-dto-spec
  (ds/spec
    {:name ::feed-publication-dto
     :spec feed-publication-dto-data}))
