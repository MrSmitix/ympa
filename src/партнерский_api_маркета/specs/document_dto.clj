(ns партнерский-api-маркета.specs.document-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.order-document-status-type :refer :all]
            )
  (:import (java.io File)))


(def document-dto-data
  {
   (ds/opt :status) order-document-status-type-spec
   (ds/opt :number) string?
   (ds/opt :date) inst?
   })

(def document-dto-spec
  (ds/spec
    {:name ::document-dto
     :spec document-dto-data}))
