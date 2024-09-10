(ns партнерский-api-маркета.specs.price-suggest-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def price-suggest-type-data
  {
   })

(def price-suggest-type-spec
  (ds/spec
    {:name ::price-suggest-type
     :spec price-suggest-type-data}))
