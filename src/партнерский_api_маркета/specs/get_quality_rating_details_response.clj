(ns партнерский-api-маркета.specs.get-quality-rating-details-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.quality-rating-details-dto :refer :all]
            )
  (:import (java.io File)))


(def get-quality-rating-details-response-data
  {
   (ds/opt :status) api-response-status-type-spec
   (ds/opt :result) quality-rating-details-dto-spec
   })

(def get-quality-rating-details-response-spec
  (ds/spec
    {:name ::get-quality-rating-details-response
     :spec get-quality-rating-details-response-data}))
