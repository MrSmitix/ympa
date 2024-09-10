(ns партнерский-api-маркета.specs.get-feed-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.feed-dto :refer :all]
            )
  (:import (java.io File)))


(def get-feed-response-data
  {
   (ds/opt :feed) feed-dto-spec
   })

(def get-feed-response-spec
  (ds/spec
    {:name ::get-feed-response
     :spec get-feed-response-data}))
