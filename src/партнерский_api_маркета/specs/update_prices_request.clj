(ns партнерский-api-маркета.specs.update-prices-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-price-dto :refer :all]
            )
  (:import (java.io File)))


(def update-prices-request-data
  {
   (ds/req :offers) (s/coll-of offer-price-dto-spec)
   })

(def update-prices-request-spec
  (ds/spec
    {:name ::update-prices-request
     :spec update-prices-request-data}))
