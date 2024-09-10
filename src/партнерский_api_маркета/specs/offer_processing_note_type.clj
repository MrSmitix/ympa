(ns партнерский-api-маркета.specs.offer-processing-note-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-processing-note-type-data
  {
   })

(def offer-processing-note-type-spec
  (ds/spec
    {:name ::offer-processing-note-type
     :spec offer-processing-note-type-data}))
