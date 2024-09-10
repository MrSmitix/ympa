(ns партнерский-api-маркета.specs.order-promo-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-promo-type-data
  {
   })

(def order-promo-type-spec
  (ds/spec
    {:name ::order-promo-type
     :spec order-promo-type-data}))
