(ns партнерский-api-маркета.specs.offer-mapping-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-mapping-dto-data
  {
   (ds/opt :marketSku) int?
   (ds/opt :modelId) int?
   (ds/opt :categoryId) int?
   })

(def offer-mapping-dto-spec
  (ds/spec
    {:name ::offer-mapping-dto
     :spec offer-mapping-dto-data}))
