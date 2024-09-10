(ns партнерский-api-маркета.specs.update-business-prices-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-business-offer-price-dto :refer :all]
            )
  (:import (java.io File)))


(def update-business-prices-request-data
  {
   (ds/req :offers) (s/coll-of update-business-offer-price-dto-spec)
   })

(def update-business-prices-request-spec
  (ds/spec
    {:name ::update-business-prices-request
     :spec update-business-prices-request-data}))
