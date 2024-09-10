(ns партнерский-api-маркета.specs.enriched-models-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.enriched-model-dto :refer :all]
            )
  (:import (java.io File)))


(def enriched-models-dto-data
  {
   (ds/req :models) (s/coll-of enriched-model-dto-spec)
   })

(def enriched-models-dto-spec
  (ds/spec
    {:name ::enriched-models-dto
     :spec enriched-models-dto-data}))
