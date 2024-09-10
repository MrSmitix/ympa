(ns партнерский-api-маркета.specs.get-warehouse-stocks-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-offers-dto :refer :all]
            )
  (:import (java.io File)))


(def get-warehouse-stocks-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :warehouses) (s/coll-of warehouse-offers-dto-spec)
   })

(def get-warehouse-stocks-dto-spec
  (ds/spec
    {:name ::get-warehouse-stocks-dto
     :spec get-warehouse-stocks-dto-data}))
