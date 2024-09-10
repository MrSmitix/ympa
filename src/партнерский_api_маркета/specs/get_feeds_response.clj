(ns партнерский-api-маркета.specs.get-feeds-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-dto :refer :all]
            )
  (:import (java.io File)))


(def get-feeds-response-data
  {
   (ds/req :feeds) (s/coll-of feed-dto-spec)
   })

(def get-feeds-response-spec
  (ds/spec
    {:name ::get-feeds-response
     :spec get-feeds-response-data}))
