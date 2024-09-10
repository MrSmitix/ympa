(ns партнерский-api-маркета.specs.channel-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def channel-type-data
  {
   })

(def channel-type-spec
  (ds/spec
    {:name ::channel-type
     :spec channel-type-data}))
