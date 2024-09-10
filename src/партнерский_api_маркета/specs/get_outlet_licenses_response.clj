(ns партнерский-api-маркета.specs.get-outlet-licenses-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.outlet-licenses-response-dto :refer :all]
            )
  (:import (java.io File)))


(def get-outlet-licenses-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) outlet-licenses-response-dto-spec
   })

(def get-outlet-licenses-response-spec
  (ds/spec
    {:name ::get-outlet-licenses-response
     :spec get-outlet-licenses-response-data}))
