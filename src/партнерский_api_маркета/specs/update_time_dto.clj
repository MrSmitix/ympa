(ns партнерский-api-маркета.specs.update-time-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-time-dto-data
  {
   (ds/req :updatedAt) inst?
   })

(def update-time-dto-spec
  (ds/spec
    {:name ::update-time-dto
     :spec update-time-dto-data}))
