(ns партнерский-api-маркета.specs.get-goods-stats-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.goods-stats-dto :refer :all]
            )
  (:import (java.io File)))


(def get-goods-stats-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) goods-stats-dto-spec
   })

(def get-goods-stats-response-spec
  (ds/spec
    {:name ::get-goods-stats-response
     :spec get-goods-stats-response-data}))
