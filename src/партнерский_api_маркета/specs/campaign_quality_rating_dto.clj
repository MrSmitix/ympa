(ns партнерский-api-маркета.specs.campaign-quality-rating-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.quality-rating-dto :refer :all]
            )
  (:import (java.io File)))


(def campaign-quality-rating-dto-data
  {
   (ds/req :campaignId) int?
   (ds/req :ratings) (s/coll-of quality-rating-dto-spec)
   })

(def campaign-quality-rating-dto-spec
  (ds/spec
    {:name ::campaign-quality-rating-dto
     :spec campaign-quality-rating-dto-data}))
