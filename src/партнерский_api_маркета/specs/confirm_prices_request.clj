(ns партнерский-api-маркета.specs.confirm-prices-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def confirm-prices-request-data
  {
   (ds/req :offerIds) (s/coll-of string?)
   })

(def confirm-prices-request-spec
  (ds/spec
    {:name ::confirm-prices-request
     :spec confirm-prices-request-data}))
