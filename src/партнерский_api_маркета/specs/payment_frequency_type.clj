(ns партнерский-api-маркета.specs.payment-frequency-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def payment-frequency-type-data
  {
   })

(def payment-frequency-type-spec
  (ds/spec
    {:name ::payment-frequency-type
     :spec payment-frequency-type-data}))
