(ns партнерский-api-маркета.specs.return-instance-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.return-instance-stock-type :refer :all]
            [партнерский-api-маркета.specs.return-instance-status-type :refer :all]
            )
  (:import (java.io File)))


(def return-instance-dto-data
  {
   (ds/opt :stockType) return-instance-stock-type-spec
   (ds/opt :status) return-instance-status-type-spec
   (ds/opt :cis) string?
   (ds/opt :imei) string?
   })

(def return-instance-dto-spec
  (ds/spec
    {:name ::return-instance-dto
     :spec return-instance-dto-data}))
