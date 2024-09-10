(ns партнерский-api-маркета.specs.flipping-pager-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def flipping-pager-dto-data
  {
   (ds/opt :total) int?
   (ds/opt :from) int?
   (ds/opt :to) int?
   (ds/opt :currentPage) int?
   (ds/opt :pagesCount) int?
   (ds/opt :pageSize) int?
   })

(def flipping-pager-dto-spec
  (ds/spec
    {:name ::flipping-pager-dto
     :spec flipping-pager-dto-data}))
