(ns партнерский-api-маркета.specs.api-not-found-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.api-error-dto :refer :all]
            )
  (:import (java.io File)))


(def api-not-found-error-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :errors) (s/coll-of api-error-dto-spec)
   })

(def api-not-found-error-response-spec
  (ds/spec
    {:name ::api-not-found-error-response
     :spec api-not-found-error-response-data}))
