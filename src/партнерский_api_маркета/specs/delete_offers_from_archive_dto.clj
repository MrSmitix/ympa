(ns партнерский-api-маркета.specs.delete-offers-from-archive-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-offers-from-archive-dto-data
  {
   (ds/opt :notUnarchivedOfferIds) (s/coll-of string?)
   })

(def delete-offers-from-archive-dto-spec
  (ds/spec
    {:name ::delete-offers-from-archive-dto
     :spec delete-offers-from-archive-dto-data}))
