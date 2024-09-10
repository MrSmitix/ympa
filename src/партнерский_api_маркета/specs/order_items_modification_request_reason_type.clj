(ns партнерский-api-маркета.specs.order-items-modification-request-reason-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-items-modification-request-reason-type-data
  {
   })

(def order-items-modification-request-reason-type-spec
  (ds/spec
    {:name ::order-items-modification-request-reason-type
     :spec order-items-modification-request-reason-type-data}))
