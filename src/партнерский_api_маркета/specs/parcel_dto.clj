(ns партнерский-api-маркета.specs.parcel-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.parcel-box-dto :refer :all]
            )
  (:import (java.io File)))


(def parcel-dto-data
  {
   (ds/req :boxes) (s/coll-of parcel-box-dto-spec)
   })

(def parcel-dto-spec
  (ds/spec
    {:name ::parcel-dto
     :spec parcel-dto-data}))
