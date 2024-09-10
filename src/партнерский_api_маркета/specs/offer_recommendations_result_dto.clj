(ns партнерский-api-маркета.specs.offer-recommendations-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.offer-recommendation-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-recommendations-result-dto-data
  {
   (ds/opt :paging) scrolling-pager-dto-spec
   (ds/req :offerRecommendations) (s/coll-of offer-recommendation-dto-spec)
   })

(def offer-recommendations-result-dto-spec
  (ds/spec
    {:name ::offer-recommendations-result-dto
     :spec offer-recommendations-result-dto-data}))
