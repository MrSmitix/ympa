(ns партнерский-api-маркета.specs.order-cancellation-reason-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-cancellation-reason-type-data
  {
   })

(def order-cancellation-reason-type-spec
  (ds/spec
    {:name ::order-cancellation-reason-type
     :spec order-cancellation-reason-type-data}))
