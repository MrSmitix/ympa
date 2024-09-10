(ns партнерский-api-маркета.specs.offer-condition-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-condition-type-data
  {
   })

(def offer-condition-type-spec
  (ds/spec
    {:name ::offer-condition-type
     :spec offer-condition-type-data}))
