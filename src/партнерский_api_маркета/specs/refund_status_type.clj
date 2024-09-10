(ns партнерский-api-маркета.specs.refund-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def refund-status-type-data
  {
   })

(def refund-status-type-spec
  (ds/spec
    {:name ::refund-status-type
     :spec refund-status-type-data}))
