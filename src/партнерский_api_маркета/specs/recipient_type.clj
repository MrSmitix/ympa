(ns партнерский-api-маркета.specs.recipient-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def recipient-type-data
  {
   })

(def recipient-type-spec
  (ds/spec
    {:name ::recipient-type
     :spec recipient-type-data}))
