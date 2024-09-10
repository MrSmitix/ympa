(ns партнерский-api-маркета.specs.model-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.model-price-dto :refer :all]
            )
  (:import (java.io File)))


(def model-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :prices) model-price-dto-spec
   })

(def model-dto-spec
  (ds/spec
    {:name ::model-dto
     :spec model-dto-data}))
