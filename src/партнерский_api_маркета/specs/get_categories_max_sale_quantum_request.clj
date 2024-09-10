(ns партнерский-api-маркета.specs.get-categories-max-sale-quantum-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-categories-max-sale-quantum-request-data
  {
   (ds/req :marketCategoryIds) (s/coll-of int?)
   })

(def get-categories-max-sale-quantum-request-spec
  (ds/spec
    {:name ::get-categories-max-sale-quantum-request
     :spec get-categories-max-sale-quantum-request-data}))
