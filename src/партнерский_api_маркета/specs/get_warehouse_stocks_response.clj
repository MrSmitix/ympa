(ns партнерский-api-маркета.specs.get-warehouse-stocks-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-warehouse-stocks-dto :refer :all]
            )
  (:import (java.io File)))


(def get-warehouse-stocks-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-warehouse-stocks-dto-spec
   })

(def get-warehouse-stocks-response-spec
  (ds/spec
    {:name ::get-warehouse-stocks-response
     :spec get-warehouse-stocks-response-data}))
