(ns партнерский-api-маркета.specs.get-models-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-models-request-data
  {
   (ds/req :models) (s/coll-of int?)
   })

(def get-models-request-spec
  (ds/spec
    {:name ::get-models-request
     :spec get-models-request-data}))
