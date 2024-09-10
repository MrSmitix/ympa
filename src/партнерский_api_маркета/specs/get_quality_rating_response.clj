(ns партнерский-api-маркета.specs.get-quality-rating-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.campaigns-quality-rating-dto :refer :all]
            )
  (:import (java.io File)))


(def get-quality-rating-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) campaigns-quality-rating-dto-spec
   })

(def get-quality-rating-response-spec
  (ds/spec
    {:name ::get-quality-rating-response
     :spec get-quality-rating-response-data}))
