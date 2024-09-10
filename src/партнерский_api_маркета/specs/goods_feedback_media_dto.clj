(ns партнерский-api-маркета.specs.goods-feedback-media-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def goods-feedback-media-dto-data
  {
   (ds/opt :photos) (s/coll-of string?)
   (ds/opt :videos) (s/coll-of string?)
   })

(def goods-feedback-media-dto-spec
  (ds/spec
    {:name ::goods-feedback-media-dto
     :spec goods-feedback-media-dto-data}))
