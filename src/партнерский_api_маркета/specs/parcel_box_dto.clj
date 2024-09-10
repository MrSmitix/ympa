(ns партнерский-api-маркета.specs.parcel-box-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def parcel-box-dto-data
  {
   (ds/opt :id) int?
   (ds/opt :fulfilmentId) string?
   })

(def parcel-box-dto-spec
  (ds/spec
    {:name ::parcel-box-dto
     :spec parcel-box-dto-data}))
