(ns партнерский-api-маркета.specs.delete-offers-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-offers-dto-data
  {
   (ds/opt :notDeletedOfferIds) (s/coll-of string?)
   })

(def delete-offers-dto-spec
  (ds/spec
    {:name ::delete-offers-dto
     :spec delete-offers-dto-data}))
