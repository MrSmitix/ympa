(ns партнерский-api-маркета.specs.get-business-settings-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.get-business-settings-info-dto :refer :all]
            )
  (:import (java.io File)))


(def get-business-settings-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) get-business-settings-info-dto-spec
   })

(def get-business-settings-response-spec
  (ds/spec
    {:name ::get-business-settings-response
     :spec get-business-settings-response-data}))
