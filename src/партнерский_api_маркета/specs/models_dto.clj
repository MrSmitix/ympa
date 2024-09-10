(ns партнерский-api-маркета.specs.models-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.model-dto :refer :all]
            )
  (:import (java.io File)))


(def models-dto-data
  {
   (ds/req :models) (s/coll-of model-dto-spec)
   })

(def models-dto-spec
  (ds/spec
    {:name ::models-dto
     :spec models-dto-data}))
