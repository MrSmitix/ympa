(ns партнерский-api-маркета.specs.campaigns-quality-rating-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.campaign-quality-rating-dto :refer :all]
            )
  (:import (java.io File)))


(def campaigns-quality-rating-dto-data
  {
   (ds/req :campaignRatings) (s/coll-of campaign-quality-rating-dto-spec)
   })

(def campaigns-quality-rating-dto-spec
  (ds/spec
    {:name ::campaigns-quality-rating-dto
     :spec campaigns-quality-rating-dto-data}))
