(ns партнерский-api-маркета.specs.offer-processing-state-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-processing-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-processing-note-dto :refer :all]
            )
  (:import (java.io File)))


(def offer-processing-state-dto-data
  {
   (ds/opt :status) offer-processing-status-type-spec
   (ds/opt :notes) (s/coll-of offer-processing-note-dto-spec)
   })

(def offer-processing-state-dto-spec
  (ds/spec
    {:name ::offer-processing-state-dto
     :spec offer-processing-state-dto-data}))
