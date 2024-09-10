(ns партнерский-api-маркета.specs.feed-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-content-dto :refer :all]
            [партнерский-api-маркета.specs.feed-download-dto :refer :all]
            [партнерский-api-маркета.specs.feed-placement-dto :refer :all]
            [партнерский-api-маркета.specs.feed-publication-dto :refer :all]
            )
  (:import (java.io File)))


(def feed-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :login) string?
   (ds/opt :name) string?
   (ds/opt :password) string?
   (ds/opt :uploadDate) inst?
   (ds/opt :url) string?
   (ds/opt :content) feed-content-dto-spec
   (ds/opt :download) feed-download-dto-spec
   (ds/opt :placement) feed-placement-dto-spec
   (ds/opt :publication) feed-publication-dto-spec
   })

(def feed-dto-spec
  (ds/spec
    {:name ::feed-dto
     :spec feed-dto-data}))
