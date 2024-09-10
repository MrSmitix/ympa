(ns партнерский-api-маркета.specs.api-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.api-error-dto :refer :all]
            )
  (:import (java.io File)))


(def api-error-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :errors) (s/coll-of api-error-dto-spec)
   })

(def api-error-response-spec
  (ds/spec
    {:name ::api-error-response
     :spec api-error-response-data}))
