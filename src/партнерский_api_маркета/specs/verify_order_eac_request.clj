(ns партнерский-api-маркета.specs.verify-order-eac-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def verify-order-eac-request-data
  {
   (ds/opt :code) string?
   })

(def verify-order-eac-request-spec
  (ds/spec
    {:name ::verify-order-eac-request
     :spec verify-order-eac-request-data}))
