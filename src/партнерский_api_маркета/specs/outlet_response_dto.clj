(ns партнерский-api-маркета.specs.outlet-response-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def outlet-response-dto-data
  {
   (ds/opt :id) int?
   })

(def outlet-response-dto-spec
  (ds/spec
    {:name ::outlet-response-dto
     :spec outlet-response-dto-data}))
