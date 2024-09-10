(ns партнерский-api-маркета.specs.price-quarantine-verdict-parameter-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.price-quarantine-verdict-param-name-type :refer :all]
            )
  (:import (java.io File)))


(def price-quarantine-verdict-parameter-dto-data
  {
   (ds/req :name) price-quarantine-verdict-param-name-type-spec
   (ds/req :value) string?
   })

(def price-quarantine-verdict-parameter-dto-spec
  (ds/spec
    {:name ::price-quarantine-verdict-parameter-dto
     :spec price-quarantine-verdict-parameter-dto-data}))
