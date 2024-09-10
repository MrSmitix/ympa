(ns партнерский-api-маркета.specs.get-campaign-region-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            )
  (:import (java.io File)))


(def get-campaign-region-response-data
  {
   (ds/opt :region) region-dto-spec
   })

(def get-campaign-region-response-spec
  (ds/spec
    {:name ::get-campaign-region-response
     :spec get-campaign-region-response-data}))
