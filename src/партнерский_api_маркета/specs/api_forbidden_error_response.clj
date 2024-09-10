(ns партнерский-api-маркета.specs.api-forbidden-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.api-error-dto :refer :all]
            )
  (:import (java.io File)))


(def api-forbidden-error-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :errors) (s/coll-of api-error-dto-spec)
   })

(def api-forbidden-error-response-spec
  (ds/spec
    {:name ::api-forbidden-error-response
     :spec api-forbidden-error-response-data}))
