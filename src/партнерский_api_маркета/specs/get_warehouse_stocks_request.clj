(ns партнерский-api-маркета.specs.get-warehouse-stocks-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-warehouse-stocks-request-data
  {
   (ds/opt :withTurnover) boolean?
   (ds/opt :archived) boolean?
   (ds/opt :offerIds) (s/coll-of string?)
   })

(def get-warehouse-stocks-request-spec
  (ds/spec
    {:name ::get-warehouse-stocks-request
     :spec get-warehouse-stocks-request-data}))
