(ns партнерский-api-маркета.specs.get-quality-rating-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-quality-rating-request-data
  {
   (ds/opt :dateFrom) inst?
   (ds/opt :dateTo) inst?
   (ds/req :campaignIds) (s/coll-of int?)
   })

(def get-quality-rating-request-spec
  (ds/spec
    {:name ::get-quality-rating-request
     :spec get-quality-rating-request-data}))
