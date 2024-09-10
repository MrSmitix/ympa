(ns партнерский-api-маркета.specs.order-substatus-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-substatus-type-data
  {
   })

(def order-substatus-type-spec
  (ds/spec
    {:name ::order-substatus-type
     :spec order-substatus-type-data}))
