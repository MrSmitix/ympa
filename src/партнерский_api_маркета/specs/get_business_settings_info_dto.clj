(ns партнерский-api-маркета.specs.get-business-settings-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.business-dto :refer :all]
            [партнерский-api-маркета.specs.business-settings-dto :refer :all]
            )
  (:import (java.io File)))


(def get-business-settings-info-dto-data
  {
   (ds/opt :info) business-dto-spec
   (ds/opt :settings) business-settings-dto-spec
   })

(def get-business-settings-info-dto-spec
  (ds/spec
    {:name ::get-business-settings-info-dto
     :spec get-business-settings-info-dto-data}))
