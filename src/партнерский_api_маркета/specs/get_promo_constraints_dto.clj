(ns партнерский-api-маркета.specs.get-promo-constraints-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-promo-constraints-dto-data
  {
   (ds/opt :warehouseIds) (s/coll-of int?)
   })

(def get-promo-constraints-dto-spec
  (ds/spec
    {:name ::get-promo-constraints-dto
     :spec get-promo-constraints-dto-data}))
