(ns партнерский-api-маркета.specs.price-quarantine-verdict-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-quarantine-verdict-type :refer :all]
            [партнерский-api-маркета.specs.price-quarantine-verdict-parameter-dto :refer :all]
            )
  (:import (java.io File)))


(def price-quarantine-verdict-dto-data
  {
   (ds/opt :type) price-quarantine-verdict-type-spec
   (ds/req :params) (s/coll-of price-quarantine-verdict-parameter-dto-spec)
   })

(def price-quarantine-verdict-dto-spec
  (ds/spec
    {:name ::price-quarantine-verdict-dto
     :spec price-quarantine-verdict-dto-data}))
