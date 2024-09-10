(ns партнерский-api-маркета.specs.get-outlets-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.full-outlet-dto :refer :all]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.flipping-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-outlets-response-data
  {
   (ds/req :outlets) (s/coll-of full-outlet-dto-spec)
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/opt :pager) flipping-pager-dto-spec
   })

(def get-outlets-response-spec
  (ds/spec
    {:name ::get-outlets-response
     :spec get-outlets-response-data}))
