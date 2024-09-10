(ns партнерский-api-маркета.specs.feed-publication-price-and-stock-update-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-publication-price-and-stock-update-dto-data
  {
   (ds/opt :fileTime) inst?
   (ds/opt :publishedTime) inst?
   })

(def feed-publication-price-and-stock-update-dto-spec
  (ds/spec
    {:name ::feed-publication-price-and-stock-update-dto
     :spec feed-publication-price-and-stock-update-dto-data}))
