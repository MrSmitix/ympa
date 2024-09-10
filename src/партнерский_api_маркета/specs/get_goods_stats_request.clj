(ns партнерский-api-маркета.specs.get-goods-stats-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-goods-stats-request-data
  {
   (ds/req :shopSkus) (s/coll-of string?)
   })

(def get-goods-stats-request-spec
  (ds/spec
    {:name ::get-goods-stats-request
     :spec get-goods-stats-request-data}))
