(ns партнерский-api-маркета.specs.put-sku-bids-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.sku-bid-item-dto :refer :all]
            )
  (:import (java.io File)))


(def put-sku-bids-request-data
  {
   (ds/req :bids) (s/coll-of sku-bid-item-dto-spec)
   })

(def put-sku-bids-request-spec
  (ds/spec
    {:name ::put-sku-bids-request
     :spec put-sku-bids-request-data}))
