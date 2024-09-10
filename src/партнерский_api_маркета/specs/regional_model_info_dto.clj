(ns партнерский-api-маркета.specs.regional-model-info-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            )
  (:import (java.io File)))


(def regional-model-info-dto-data
  {
   (ds/opt :currency) currency-type-spec
   (ds/opt :regionId) int?
   })

(def regional-model-info-dto-spec
  (ds/spec
    {:name ::regional-model-info-dto
     :spec regional-model-info-dto-data}))
