(ns партнерский-api-маркета.specs.set-feed-params-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-parameter-dto :refer :all]
            )
  (:import (java.io File)))


(def set-feed-params-request-data
  {
   (ds/req :parameters) (s/coll-of feed-parameter-dto-spec)
   })

(def set-feed-params-request-spec
  (ds/spec
    {:name ::set-feed-params-request
     :spec set-feed-params-request-data}))
