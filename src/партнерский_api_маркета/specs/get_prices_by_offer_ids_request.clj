(ns партнерский-api-маркета.specs.get-prices-by-offer-ids-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-prices-by-offer-ids-request-data
  {
   (ds/opt :offerIds) (s/coll-of string?)
   })

(def get-prices-by-offer-ids-request-spec
  (ds/spec
    {:name ::get-prices-by-offer-ids-request
     :spec get-prices-by-offer-ids-request-data}))
