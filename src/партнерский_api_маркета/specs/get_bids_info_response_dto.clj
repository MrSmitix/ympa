(ns партнерский-api-маркета.specs.get-bids-info-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.sku-bid-item-dto :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            )
  (:import (java.io File)))


(def get-bids-info-response-dto-data
  {
   (ds/req :bids) (s/coll-of sku-bid-item-dto-spec)
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   })

(def get-bids-info-response-dto-spec
  (ds/spec
    {:name ::get-bids-info-response-dto
     :spec get-bids-info-response-dto-data}))
