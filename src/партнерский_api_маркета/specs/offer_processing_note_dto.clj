(ns партнерский-api-маркета.specs.offer-processing-note-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.offer-processing-note-type :refer :all]
            )
  (:import (java.io File)))


(def offer-processing-note-dto-data
  {
   (ds/opt :type) offer-processing-note-type-spec
   (ds/opt :payload) string?
   })

(def offer-processing-note-dto-spec
  (ds/spec
    {:name ::offer-processing-note-dto
     :spec offer-processing-note-dto-data}))
