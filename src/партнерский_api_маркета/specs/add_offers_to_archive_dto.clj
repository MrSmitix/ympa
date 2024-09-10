(ns партнерский-api-маркета.specs.add-offers-to-archive-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.add-offers-to-archive-error-dto :refer :all]
            )
  (:import (java.io File)))


(def add-offers-to-archive-dto-data
  {
   (ds/opt :notArchivedOffers) (s/coll-of add-offers-to-archive-error-dto-spec)
   })

(def add-offers-to-archive-dto-spec
  (ds/spec
    {:name ::add-offers-to-archive-dto
     :spec add-offers-to-archive-dto-data}))
