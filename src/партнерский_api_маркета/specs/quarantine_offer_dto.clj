(ns партнерский-api-маркета.specs.quarantine-offer-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            [партнерский-api-маркета.specs.price-quarantine-verdict-dto :refer :all]
            )
  (:import (java.io File)))


(def quarantine-offer-dto-data
  {
   (ds/opt :offerId) string?
   (ds/opt :currentPrice) base-price-dto-spec
   (ds/opt :lastValidPrice) base-price-dto-spec
   (ds/opt :verdicts) (s/coll-of price-quarantine-verdict-dto-spec)
   })

(def quarantine-offer-dto-spec
  (ds/spec
    {:name ::quarantine-offer-dto
     :spec quarantine-offer-dto-data}))
