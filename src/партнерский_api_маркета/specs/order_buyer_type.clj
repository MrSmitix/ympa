(ns партнерский-api-маркета.specs.order-buyer-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-buyer-type-data
  {
   })

(def order-buyer-type-spec
  (ds/spec
    {:name ::order-buyer-type
     :spec order-buyer-type-data}))
