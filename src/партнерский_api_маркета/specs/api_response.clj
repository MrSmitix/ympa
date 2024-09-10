(ns партнерский-api-маркета.specs.api-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            )
  (:import (java.io File)))


(def api-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   })

(def api-response-spec
  (ds/spec
    {:name ::api-response
     :spec api-response-data}))
