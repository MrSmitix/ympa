(ns партнерский-api-маркета.specs.price-competitiveness-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def price-competitiveness-type-data
  {
   })

(def price-competitiveness-type-spec
  (ds/spec
    {:name ::price-competitiveness-type
     :spec price-competitiveness-type-data}))
