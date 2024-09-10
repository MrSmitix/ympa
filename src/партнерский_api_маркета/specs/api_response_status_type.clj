(ns партнерский-api-маркета.specs.api-response-status-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def api-response-status-type-data
  {
   })

(def api-response-status-type-spec
  (ds/spec
    {:name ::api-response-status-type
     :spec api-response-status-type-data}))
