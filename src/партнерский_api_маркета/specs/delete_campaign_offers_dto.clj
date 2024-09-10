(ns партнерский-api-маркета.specs.delete-campaign-offers-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-campaign-offers-dto-data
  {
   (ds/opt :notDeletedOfferIds) (s/coll-of string?)
   })

(def delete-campaign-offers-dto-spec
  (ds/spec
    {:name ::delete-campaign-offers-dto
     :spec delete-campaign-offers-dto-data}))
