(ns партнерский-api-маркета.specs.get-business-buyer-info-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.order-business-buyer-dto :refer :all]
            )
  (:import (java.io File)))


(def get-business-buyer-info-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) order-business-buyer-dto-spec
   })

(def get-business-buyer-info-response-spec
  (ds/spec
    {:name ::get-business-buyer-info-response
     :spec get-business-buyer-info-response-data}))
