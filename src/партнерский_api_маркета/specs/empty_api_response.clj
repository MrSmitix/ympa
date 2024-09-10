(ns партнерский-api-маркета.specs.empty-api-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            )
  (:import (java.io File)))


(def empty-api-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   })

(def empty-api-response-spec
  (ds/spec
    {:name ::empty-api-response
     :spec empty-api-response-data}))
