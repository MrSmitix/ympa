(ns партнерский-api-маркета.specs.turnover-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def turnover-type-data
  {
   })

(def turnover-type-spec
  (ds/spec
    {:name ::turnover-type
     :spec turnover-type-data}))
