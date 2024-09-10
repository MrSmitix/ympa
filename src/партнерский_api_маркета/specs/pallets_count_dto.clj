(ns партнерский-api-маркета.specs.pallets-count-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pallets-count-dto-data
  {
   (ds/opt :planned) int?
   (ds/opt :fact) int?
   })

(def pallets-count-dto-spec
  (ds/spec
    {:name ::pallets-count-dto
     :spec pallets-count-dto-data}))
