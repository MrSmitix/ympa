(ns партнерский-api-маркета.specs.order-document-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-document-status-type-data
  {
   })

(def order-document-status-type-spec
  (ds/spec
    {:name ::order-document-status-type
     :spec order-document-status-type-data}))
