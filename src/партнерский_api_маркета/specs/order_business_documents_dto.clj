(ns партнерский-api-маркета.specs.order-business-documents-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.document-dto :refer :all]
            [партнерский-api-маркета.specs.document-dto :refer :all]
            [партнерский-api-маркета.specs.document-dto :refer :all]
            [партнерский-api-маркета.specs.document-dto :refer :all]
            [партнерский-api-маркета.specs.document-dto :refer :all]
            )
  (:import (java.io File)))


(def order-business-documents-dto-data
  {
   (ds/opt :upd) document-dto-spec
   (ds/opt :ukd) document-dto-spec
   (ds/opt :torgTwelve) document-dto-spec
   (ds/opt :sf) document-dto-spec
   (ds/opt :ksf) document-dto-spec
   })

(def order-business-documents-dto-spec
  (ds/spec
    {:name ::order-business-documents-dto
     :spec order-business-documents-dto-data}))
