(ns партнерский-api-маркета.specs.get-offer-recommendations-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.field-state-type :refer :all]
            [партнерский-api-маркета.specs.field-state-type :refer :all]
            [партнерский-api-маркета.specs.price-competitiveness-type :refer :all]
            )
  (:import (java.io File)))


(def get-offer-recommendations-request-data
  {
   (ds/opt :offerIds) (s/coll-of string?)
   (ds/opt :cofinancePriceFilter) field-state-type-spec
   (ds/opt :recommendedCofinancePriceFilter) field-state-type-spec
   (ds/opt :competitivenessFilter) price-competitiveness-type-spec
   })

(def get-offer-recommendations-request-spec
  (ds/spec
    {:name ::get-offer-recommendations-request
     :spec get-offer-recommendations-request-data}))
