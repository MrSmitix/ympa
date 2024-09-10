(ns партнерский-api-маркета.specs.get-return-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.return-dto :refer :all]
            )
  (:import (java.io File)))


(def get-return-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) return-dto-spec
   })

(def get-return-response-spec
  (ds/spec
    {:name ::get-return-response
     :spec get-return-response-data}))
