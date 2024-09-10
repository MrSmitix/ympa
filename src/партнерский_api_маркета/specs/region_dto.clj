(ns партнерский-api-маркета.specs.region-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.region-type :refer :all]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            )
  (:import (java.io File)))


(def region-dto-data
  {
   (ds/opt :id) int?
   (ds/req :name) string?
   (ds/req :type) region-type-spec
   (ds/opt :parent) region-dto-spec
   (ds/opt :children) (s/coll-of region-dto-spec)
   })

(def region-dto-spec
  (ds/spec
    {:name ::region-dto
     :spec region-dto-data}))
