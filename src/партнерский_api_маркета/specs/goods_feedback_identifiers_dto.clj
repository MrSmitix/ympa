(ns партнерский-api-маркета.specs.goods-feedback-identifiers-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def goods-feedback-identifiers-dto-data
  {
   (ds/req :orderId) int?
   (ds/req :modelId) int?
   })

(def goods-feedback-identifiers-dto-spec
  (ds/spec
    {:name ::goods-feedback-identifiers-dto
     :spec goods-feedback-identifiers-dto-data}))
