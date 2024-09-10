(ns партнерский-api-маркета.specs.price-suggest-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-suggest-type :refer :all]
            )
  (:import (java.io File)))


(def price-suggest-dto-data
  {
   (ds/opt :type) price-suggest-type-spec
   (ds/opt :price) float?
   })

(def price-suggest-dto-spec
  (ds/spec
    {:name ::price-suggest-dto
     :spec price-suggest-dto-data}))
