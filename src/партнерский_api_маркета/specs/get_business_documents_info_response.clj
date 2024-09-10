(ns партнерский-api-маркета.specs.get-business-documents-info-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.order-business-documents-dto :refer :all]
            )
  (:import (java.io File)))


(def get-business-documents-info-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) order-business-documents-dto-spec
   })

(def get-business-documents-info-response-spec
  (ds/spec
    {:name ::get-business-documents-info-response
     :spec get-business-documents-info-response-data}))
