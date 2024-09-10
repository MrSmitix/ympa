(ns партнерский-api-маркета.specs.goods-feedback-description-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def goods-feedback-description-dto-data
  {
   (ds/opt :advantages) string?
   (ds/opt :disadvantages) string?
   (ds/opt :comment) string?
   })

(def goods-feedback-description-dto-spec
  (ds/spec
    {:name ::goods-feedback-description-dto
     :spec goods-feedback-description-dto-data}))
