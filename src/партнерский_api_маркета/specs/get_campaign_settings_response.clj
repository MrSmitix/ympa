(ns партнерский-api-маркета.specs.get-campaign-settings-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.campaign-settings-dto :refer :all]
            )
  (:import (java.io File)))


(def get-campaign-settings-response-data
  {
   (ds/opt :settings) campaign-settings-dto-spec
   })

(def get-campaign-settings-response-spec
  (ds/spec
    {:name ::get-campaign-settings-response
     :spec get-campaign-settings-response-data}))
