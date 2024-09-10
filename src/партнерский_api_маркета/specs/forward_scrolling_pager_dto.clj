(ns партнерский-api-маркета.specs.forward-scrolling-pager-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def forward-scrolling-pager-dto-data
  {
   (ds/opt :nextPageToken) string?
   })

(def forward-scrolling-pager-dto-spec
  (ds/spec
    {:name ::forward-scrolling-pager-dto
     :spec forward-scrolling-pager-dto-data}))
