(ns партнерский-api-маркета.specs.get-delivery-services-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.delivery-services-dto :refer :all]
            )
  (:import (java.io File)))


(def get-delivery-services-response-data
  {
   (ds/opt :result) delivery-services-dto-spec
   })

(def get-delivery-services-response-spec
  (ds/spec
    {:name ::get-delivery-services-response
     :spec get-delivery-services-response-data}))
