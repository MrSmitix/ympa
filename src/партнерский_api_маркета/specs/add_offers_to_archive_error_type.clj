(ns партнерский-api-маркета.specs.add-offers-to-archive-error-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def add-offers-to-archive-error-type-data
  {
   })

(def add-offers-to-archive-error-type-spec
  (ds/spec
    {:name ::add-offers-to-archive-error-type
     :spec add-offers-to-archive-error-type-data}))
