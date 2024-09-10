(ns партнерский-api-маркета.specs.search-shipments-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.shipment-info-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def search-shipments-response-dto-data
  {
   (ds/req :shipments) (s/coll-of shipment-info-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def search-shipments-response-dto-spec
  (ds/spec
    {:name ::search-shipments-response-dto
     :spec search-shipments-response-dto-data}))
