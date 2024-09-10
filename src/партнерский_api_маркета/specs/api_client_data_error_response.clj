(ns партнерский-api-маркета.specs.api-client-data-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.api-error-dto :refer :all]
            )
  (:import (java.io File)))


(def api-client-data-error-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :errors) (s/coll-of api-error-dto-spec)
   })

(def api-client-data-error-response-spec
  (ds/spec
    {:name ::api-client-data-error-response
     :spec api-client-data-error-response-data}))
