(ns партнерский-api-маркета.specs.return-instance-stock-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-instance-stock-type-data
  {
   })

(def return-instance-stock-type-spec
  (ds/spec
    {:name ::return-instance-stock-type
     :spec return-instance-stock-type-data}))
