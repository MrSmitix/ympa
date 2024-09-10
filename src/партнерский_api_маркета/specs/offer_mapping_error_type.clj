(ns партнерский-api-маркета.specs.offer-mapping-error-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offer-mapping-error-type-data
  {
   })

(def offer-mapping-error-type-spec
  (ds/spec
    {:name ::offer-mapping-error-type
     :spec offer-mapping-error-type-data}))
