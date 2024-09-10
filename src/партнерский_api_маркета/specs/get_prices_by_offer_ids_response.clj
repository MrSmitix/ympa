(ns партнерский-api-маркета.specs.get-prices-by-offer-ids-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-price-by-offer-ids-list-response-dto :refer :all]
            )
  (:import (java.io File)))


(def get-prices-by-offer-ids-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) offer-price-by-offer-ids-list-response-dto-spec
   })

(def get-prices-by-offer-ids-response-spec
  (ds/spec
    {:name ::get-prices-by-offer-ids-response
     :spec get-prices-by-offer-ids-response-data}))
