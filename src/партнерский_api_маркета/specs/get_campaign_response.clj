(ns партнерский-api-маркета.specs.get-campaign-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.campaign-dto :refer :all]
            )
  (:import (java.io File)))


(def get-campaign-response-data
  {
   (ds/opt :campaign) campaign-dto-spec
   })

(def get-campaign-response-spec
  (ds/spec
    {:name ::get-campaign-response
     :spec get-campaign-response-data}))
