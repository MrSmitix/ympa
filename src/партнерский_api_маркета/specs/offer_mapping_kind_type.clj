(ns партнерский-api-маркета.specs.offer-mapping-kind-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-mapping-kind-type-data
  {
   })

(def offer-mapping-kind-type-spec
  (ds/spec
    {:name ::offer-mapping-kind-type
     :spec offer-mapping-kind-type-data}))
