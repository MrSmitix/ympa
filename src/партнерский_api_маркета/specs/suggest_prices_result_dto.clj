(ns партнерский-api-маркета.specs.suggest-prices-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-suggest-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def suggest-prices-result-dto-data
  {
   (ds/req :offers) (s/coll-of price-suggest-offer-dto-spec)
   })

(def suggest-prices-result-dto-spec
  (ds/spec
    {:name ::suggest-prices-result-dto
     :spec suggest-prices-result-dto-data}))
