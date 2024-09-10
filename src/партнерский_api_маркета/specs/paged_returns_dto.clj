(ns партнерский-api-маркета.specs.paged-returns-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.return-dto :refer :all]
            )
  (:import (java.io File)))


(def paged-returns-dto-data
  {
   (ds/opt :paging) forward-scrolling-pager-dto-spec
   (ds/req :returns) (s/coll-of return-dto-spec)
   })

(def paged-returns-dto-spec
  (ds/spec
    {:name ::paged-returns-dto
     :spec paged-returns-dto-data}))
