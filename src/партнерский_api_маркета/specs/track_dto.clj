(ns партнерский-api-маркета.specs.track-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def track-dto-data
  {
   (ds/opt :trackCode) string?
   })

(def track-dto-spec
  (ds/spec
    {:name ::track-dto
     :spec track-dto-data}))
