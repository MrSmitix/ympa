(ns партнерский-api-маркета.specs.update-campaign-offers-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.update-campaign-offer-dto :refer :all]
            )
  (:import (java.io File)))


(def update-campaign-offers-request-data
  {
   (ds/req :offers) (s/coll-of update-campaign-offer-dto-spec)
   })

(def update-campaign-offers-request-spec
  (ds/spec
    {:name ::update-campaign-offers-request
     :spec update-campaign-offers-request-data}))
