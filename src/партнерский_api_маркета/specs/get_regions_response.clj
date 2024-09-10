(ns партнерский-api-маркета.specs.get-regions-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-regions-response-data
  {
   (ds/req :regions) (s/coll-of region-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def get-regions-response-spec
  (ds/spec
    {:name ::get-regions-response
     :spec get-regions-response-data}))
