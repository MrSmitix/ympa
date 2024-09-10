(ns партнерский-api-маркета.specs.feed-publication-full-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feed-publication-full-dto-data
  {
   (ds/opt :fileTime) inst?
   (ds/opt :publishedTime) inst?
   })

(def feed-publication-full-dto-spec
  (ds/spec
    {:name ::feed-publication-full-dto
     :spec feed-publication-full-dto-data}))
