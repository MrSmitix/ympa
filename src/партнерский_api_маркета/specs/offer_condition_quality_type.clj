(ns партнерский-api-маркета.specs.offer-condition-quality-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-condition-quality-type-data
  {
   })

(def offer-condition-quality-type-spec
  (ds/spec
    {:name ::offer-condition-quality-type
     :spec offer-condition-quality-type-data}))
