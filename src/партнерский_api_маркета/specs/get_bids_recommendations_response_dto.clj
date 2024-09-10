(ns партнерский-api-маркета.specs.get-bids-recommendations-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.sku-bid-recommendation-item-dto :refer :all]
            )
  (:import (java.io File)))


(def get-bids-recommendations-response-dto-data
  {
   (ds/req :recommendations) (s/coll-of sku-bid-recommendation-item-dto-spec)
   })

(def get-bids-recommendations-response-dto-spec
  (ds/spec
    {:name ::get-bids-recommendations-response-dto
     :spec get-bids-recommendations-response-dto-data}))
