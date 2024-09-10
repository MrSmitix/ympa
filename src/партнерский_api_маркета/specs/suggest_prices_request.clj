(ns партнерский-api-маркета.specs.suggest-prices-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.suggest-offer-price-dto :refer :all]
            )
  (:import (java.io File)))


(def suggest-prices-request-data
  {
   (ds/req :offers) (s/coll-of suggest-offer-price-dto-spec)
   })

(def suggest-prices-request-spec
  (ds/spec
    {:name ::suggest-prices-request
     :spec suggest-prices-request-data}))
