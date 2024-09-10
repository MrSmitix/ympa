(ns партнерский-api-маркета.specs.goods-stats-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.goods-stats-goods-dto :refer :all]
            )
  (:import (java.io File)))


(def goods-stats-dto-data
  {
   (ds/req :shopSkus) (s/coll-of goods-stats-goods-dto-spec)
   })

(def goods-stats-dto-spec
  (ds/spec
    {:name ::goods-stats-dto
     :spec goods-stats-dto-data}))
