(ns партнерский-api-маркета.specs.scrolling-pager-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def scrolling-pager-dto-data
  {
   (ds/opt :nextPageToken) string?
   (ds/opt :prevPageToken) string?
   })

(def scrolling-pager-dto-spec
  (ds/spec
    {:name ::scrolling-pager-dto
     :spec scrolling-pager-dto-data}))
