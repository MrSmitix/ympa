(ns партнерский-api-маркета.specs.offer-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-type-data
  {
   })

(def offer-type-spec
  (ds/spec
    {:name ::offer-type
     :spec offer-type-data}))
